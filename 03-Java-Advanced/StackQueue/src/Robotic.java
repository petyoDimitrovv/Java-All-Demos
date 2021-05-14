//import java.util.ArrayDeque;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Robotic {
//    public static void main(String[] args) {
////        Scanner scanner = new Scanner(System.in);
//
//        String[] inputRobots = scanner.nextLine().split(";");
//
//        Map<String, Integer> robots = splitRobotsDataIntoLinkedHashMap(inputRobots);
//
//        String time = scanner.nextLine();
//
//        int[] processTimes = new int[robots.size()];
//
//        ArrayDeque<String> products = new ArrayDeque<>();
//
//        String line = scanner.nextLine();
//
//        while (!line.equals("End")) {
//            products.add(line);
//            line = scanner.nextLine();
//        }
//        while (!products.isEmpty()){
//            String current = products.poll();
//
//            for (int i = 0; i < processTimes.length; i++) {
//               if(processTimes[i]==0)
//            }
//
//        }
//
//    }
//
//    private static Map<String, Integer> splitRobotsDataIntoLinkedHashMap(String[] inputRobots) {
//        Map<String, Integer> robots = new LinkedHashMap<>();
//
//        for (int i = 0; i < inputRobots.length; i++) {
//            String line = inputRobots[i];
//            int index = line.indexOf("-");
//            String name =line.substring(0,index);
//                 int time = Integer.parseInt(line.substring(index + 1));
//                 robots.put(name , time);
//        }
//
//        return robots;
//
//    }
//}
