package shano;

public class InvalidPasswordInput extends IllegalArgumentException {
    public InvalidPasswordInput(String message){
        super(message);
    }

}
