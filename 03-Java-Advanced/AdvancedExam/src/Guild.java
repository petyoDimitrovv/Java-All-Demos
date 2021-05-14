import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Guild {
   private String name;
   private int capacity;
   private List <Player> roster;

    public Guild(String name, int capacity, List<Player> roster) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addPlayer(Player player){
        if(this.roster.size() < this.capacity)
        this.roster.add(player);
    }
    public void promotePlayer(String name){
        for (Player player : this.roster ) {
            if(!player.getName().equals("Member")){
                this.setName();
            }

        }
    }
}


