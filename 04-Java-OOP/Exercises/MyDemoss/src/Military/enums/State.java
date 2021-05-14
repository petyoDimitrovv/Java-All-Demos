package Military.enums;

public enum State {
    IN_PROGRESS("InProgress"), FINISHED("Finished");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
