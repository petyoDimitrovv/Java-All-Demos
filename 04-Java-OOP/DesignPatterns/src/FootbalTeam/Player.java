package FootbalTeam;

public class Player {

    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int dribble, int passing, int shooting, int sprint) {
        this.name = name;
        this.setSprint(sprint);
        this.setEndurance(endurance);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public void setSprint(int sprint) {
        if(sprint <0 || sprint > 100){
            throw new IllegalArgumentException("Invalid point");
        }
        this.sprint = sprint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        if(endurance <0 || endurance > 100){
            throw new IllegalArgumentException("Invalid point");
        }
        this.endurance = endurance;
    }

    private void setDribble(int dribble) {
        if(dribble <0 || dribble > 100){
            throw new IllegalArgumentException("Invalid point");
        }
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        if(passing <0 || passing > 100){
            throw new IllegalArgumentException("Invalid point");
        }
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        if(shooting <0 || shooting > 100){
            throw new IllegalArgumentException("Invalid point");
        }
        this.shooting = shooting;
    }
    public double overallSkillLevel(){
        int skillLevel = (this.shooting + this.dribble + this.endurance + this.passing + this.sprint) / 5;
        return skillLevel;
    }
}
