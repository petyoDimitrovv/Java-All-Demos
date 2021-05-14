import com.sun.source.tree.Tree;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();

        TreeSet<String> regular = new TreeSet<>();
        TreeSet<String> vip = new TreeSet<>();

        while(!guest.equals("PARTY")){

            char firstChar = guest.charAt(0);

            if (Character.isDigit(firstChar)){
                vip.add(guest);
            } else{
                regular.add(guest);
            }

            guest = scanner.nextLine();
        }
        guest = scanner.nextLine();

        Set<String> arrivedGuest = new LinkedHashSet<>();

        while (!guest.equals("END")){

            arrivedGuest.add(guest);
            vip.remove(guest);
            regular.remove(guest);
            guest = scanner.nextLine();
        }

        System.out.println(vip.size()+ regular.size());
        for (String g : vip) {
            System.out.println(g);
            
        } for (String g : regular) {
            System.out.println(g);

        }

    }
}
