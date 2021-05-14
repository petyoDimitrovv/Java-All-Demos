package FootbalTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player){
        this.players.add(player);


    }
    public void removePlayer(String player){
        int index = -1;
        for (int i = 0; i < this.players.size(); i++) {
            if(this.players.get(i).getName().equals(player)){
                index = i;
                break;
            }
            
        }
        if (index != -1){
            this.players.remove(index);
        }

    }
    public double GetRating(){
        return  this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0.00);

    }
}
