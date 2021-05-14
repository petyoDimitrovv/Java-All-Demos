import java.util.*;

public class CarSalesman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engineMap = new HashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);

            Engine engine;

            if(tokens.length == 2){
                engine = new Engine(model, power);

            } else if (tokens.length == 4) {
                int displacement = Integer.parseInt(tokens[2]);
                String efficiency = tokens[3];
                engine = new Engine(model, power,displacement, efficiency );

            }else {
                try{
                    int displacement = Integer.parseInt(tokens[2]);
                    engine = new Engine(model, power, displacement);
                }catch (NumberFormatException EX) {
                    engine = new Engine(model,power , tokens[2]);
                }
            }
            engineMap.put(model, engine);
        }
        n = Integer.parseInt(scanner.nextLine());
//=========================================================

        List<Car> cars = new ArrayList<>();
        while (n--> 0 ){
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            String engineModel = tokens[1];

            Car car;

            if(tokens.length == 2){
                car = new Car(model, engineMap.get(engineModel));

            } else if (tokens.length == 4) {
                int weight = Integer.parseInt(tokens[2]);
                String colour = tokens[3];
                car = new Car(model, engineMap.get(engineModel),weight, colour );

            }else {
                try{
                    int weight = Integer.parseInt(tokens[2]);
                   car = new Car(model, engineMap.get(engineModel), weight);
                }catch (NumberFormatException EX) {
                   car = new Car(model,engineMap.get(engineModel) , tokens[2]);
                }
            }
           cars.add(car);
        }
        cars.forEach(System.out::println);

        }
    }

