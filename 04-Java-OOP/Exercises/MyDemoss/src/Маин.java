import Military.implementation.PrivateImpl;
import Military.interfaces.Soldier;

import java.util.*;
import java.util.stream.Collectors;

public class Маин {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        while (!(line = scanner.nextLine()).equals("End"));

        String[] tokens = line.split(" ");
        switch (tokens[0]){
            case "Private" :
                Soldier priv = new PrivateImpl(Integer.parseInt(tokens[1]),tokens[2],
                        tokens[3], Double.parseDouble(tokens[4]));
        }


    }


}




