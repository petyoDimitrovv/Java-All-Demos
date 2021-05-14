package CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suit = reader.readLine();

        CardRank cardRank = CardRank.valueOf(rank);
        CardSuit cardSuit  = CardSuit.valueOf(suit);
        int power = cardRank.power + cardSuit.power;


        System.out.printf("Card name: %s of %s; Card power: %d",cardRank, cardSuit ,power );
        }

    }


