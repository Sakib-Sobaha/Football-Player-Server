package sample;

import javafx.application.Platform;
import util.LoginDTO;

import java.io.IOException;

public class ReadThread implements Runnable {
    private final Thread thr;
    private final Main main;

    public ReadThread(Main main){
        this.main = main;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run(){
        try{
            while(true){
                Object o = main.getNetworkUtil().read();
                if(o != null){
                    if(o instanceof LoginDTO){
                        LoginDTO loginDTO = (LoginDTO) o;
                        System.out.println(loginDTO.getUserName());
                        System.out.println(loginDTO.isStatus());
                        Platform.runLater(new Runnable(){
                            @Override
                            public void run(){
                                if(loginDTO.isStatus()){
                                    try{
                                        main.showClubPage();
                                    }catch(Exception e){
                                        e.printStackTrace();
                                    }
                                }
                                else{
                                    main.showAlert();
                                }
                            }
                        });
                    }
                }
            }
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e);
        }finally{
            try{
                main.getNetworkUtil().closeConnection();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }


}

