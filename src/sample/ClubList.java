package sample;

import java.util.ArrayList;
import java.util.List;

public class ClubList {
    List<Club>clubList = new ArrayList();



    public  ClubList(){

    }

    public  ClubList(List<Player> playerList){
        for(Player p: playerList){
            Club c1 = new Club(p.getClub());
            clubList.add(c1);
        }

        for(int i=0; i<clubList.size(); ++i){
            for(int j = i; j<clubList.size(); ++j){
                if(clubList.get(j).getclubName().equals(clubList.get(i).getclubName())){
                    clubList.remove(j);
                    clubList.remove(i);
                }
            }
        }
    }

    public void setclubList(List<Club>clubList){
        this.clubList = clubList;
    }

    public void getClubs(){
        for(Club c: this.clubList){
            System.out.println(c.getclubName());
        }
    }

    public List getclubs(){
        List<Club>clubs = new ArrayList();
        clubs = this.clubList;
        return clubs;
    }
}

