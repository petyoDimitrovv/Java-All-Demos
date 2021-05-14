package Military.implementation;

import Military.enums.State;

public class Mission {
    private String codeName;
    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    public String getCodeName() {
        return codeName;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void completeMission() {
        this.setState(State.FINISHED);

    }
}