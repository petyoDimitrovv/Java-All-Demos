package shano;

public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.setPassword(password);
        this.password = password;
    }

    public void setPassword(String password) {
        boolean hasValid = false;
        for (int i = 0; i < password.length() ; i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasValid = true;
                break;
            }
        }
            if(!hasValid){
                throw new InvalidPasswordInput("Password must contains at least one digit");
            };
        this.password = password;

        }
    }

