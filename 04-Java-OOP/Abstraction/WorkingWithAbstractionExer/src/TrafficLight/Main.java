package TrafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        TrafficLights[] lights = (TrafficLights[]) Arrays.stream(reader.readLine().split("\\s+"))
                .map(TrafficLights::valueOf)
                .toArray(TrafficLights[]::new);

        int n = Integer.parseInt(reader.readLine());

        TrafficLights[] trafficLights = TrafficLights.values();

        while (n -- > 0) {
            for (int i = 0; i < lights.length ; i++) {

                TrafficLights trafficLight = lights[i];
                int next = trafficLight.ordinal() + 1;
                if(next == lights.length){
                    next = 0;
                }
                lights[i] = trafficLights[next];
                System.out.println(lights[i] + " ");


                }
                System.out.println();
            }

        }
    }
