import java.util.*;
import java.util.stream.Collectors;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] element = scanner.nextLine().substring(7).split(", ");
        int[] coins = new int[element.length];
        for (int i = 0; i < coins.length ; i++) {
            coins[i] = Integer.parseInt(element[i]);
        }

        int targetSum = Integer.parseInt(scanner.nextLine().substring(5));

        Map<Integer, Integer> usedCoins = choseCoins(coins, targetSum);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()){
            System.out.println(usedCoin.getKey() + " -> " + usedCoin.getValue());
        }


    }

    private static Map<Integer, Integer> choseCoins(int[] coins, int targetSum) {
        List<Integer> sortedCoins = Arrays.stream(coins).
                boxed()
                .sorted((f, s) -> Integer.compare(s, f))
                .collect(Collectors.toList());

                int coinIndex = 0;

                Map<Integer, Integer> resultMap = new HashMap<>();

                while(targetSum > 0){
                    int coin = sortedCoins.get(coinIndex++);

                    int coinToTake =targetSum / coin;
                    targetSum %= coin;

                    resultMap.put(coin, coinToTake);
                }
                return resultMap;

    }
}
