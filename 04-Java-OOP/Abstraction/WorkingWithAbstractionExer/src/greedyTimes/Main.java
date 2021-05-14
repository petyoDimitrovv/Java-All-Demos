
package greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacityOfTheBag = Long.parseLong(scanner.nextLine());
        String[] treasure = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(capacityOfTheBag);

        for (int i = 0; i < treasure.length; i += 2) {
            String item = treasure[i];
            long quantity = Long.parseLong(treasure[i + 1]);

            String name = "";

            if (item.length() == 3) {
                name = "Cash";
            } else if (item.toLowerCase().endsWith("gem")) {
                name = "Gem";
            } else if (item.toLowerCase().equals("gold")) {
                name = "Gold";
            }

            if (name.equals("")) {
                continue;
            } else if (bag.getCapacity() < quantity) {
                continue;
            }

            switch (name) {
                case "Gem":
                    if (!bag.isGemsContainsName(name)) {
                        if (bag.getGold() == null) {
                            if (quantity > bag.getGold().getValue()) {
                                continue;
                            }
                            bag.getGems().add(new Gems(item, quantity));
                        } else {
                            continue;
                        }
                    } else if (bag.totalGems() + quantity > bag.getGold().getValue()) {
                        continue;
                    } else {
                        Gems gems = bag.findByName(item);
                        gems.setValue(gems.getValue() + quantity);
                    }
                    break;
                case "Cash":
                    if (!bag.isCashContainsName(name)) {
                        if (bag.getGems().size() > 0) {
                            if (quantity > bag.getGold().getValue()) {
                                continue;
                            }
                            bag.getCash().add(new Cash(item, quantity));
                        } else {
                            continue;
                        }
                    } else if (bag.totalCash() + quantity > bag.totalGems()) {
                        continue;
                    } else {
                        Cash cash = bag.findCashByName(item);
                        cash.setValue(cash.getValue() + quantity);
                        bag.setCapacity(bag.getCapacity() - quantity);
                    }
                    break;
                case "Gold":
                    if (bag.getGold() == null) {
                        bag.setGold(new Gold(quantity));
                    } else {
                        Gold gold = bag.getGold();
                        gold.setValue(gold.getValue() + quantity);
                        bag.setCapacity(bag.getCapacity() - quantity);

                    }
                    break;
            }

//            if (!bag.containsKey(name)) {
//                bag.put((name), new LinkedHashMap<String, Long>());
//            }
//
//            if (!bag.get(name).containsKey(item)) {
//                bag.get(name).put(item, 0L);
//            }
//
//
//            bag.get(name).put(item, bag.get(name).get(item) + quantity);
//
//        }
//
//        for (var x : bag.entrySet()) {
//            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();
//
//            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));
//
//            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
//
//        }
        }
    }
}