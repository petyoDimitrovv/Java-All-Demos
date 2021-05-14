package blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BlackBoxInt blackBoxInt ;

        try {

            Constructor<?> ctor = BlackBoxInt.class.getDeclaredConstructor();
            ctor.setAccessible(true);
            Object obj = ctor.newInstance();
            assert obj instanceof BlackBoxInt;
            blackBoxInt = (BlackBoxInt)obj;


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw  new Exception(e);
        }
        Method[] methods = blackBoxInt.getClass().getDeclaredMethods();

        Map<String, Method> methodMap =
                Arrays.stream(blackBoxInt.getClass().getDeclaredMethods())
                .collect(Collectors.toMap(Method::getName, m ->m));

        String line = scanner.nextLine();

        while (!line.equals("END")){

            String[] token = line.split("_");

            String command = token[0];

            int numb = Integer.parseInt(token[1]);

            Method method = methodMap.get(command);
            method.setAccessible(true);
            method.invoke(blackBoxInt, numb);

            Field innerValue = BlackBoxInt.class.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            int value = (int) innerValue.get(blackBoxInt);
            System.out.println(value);




            line = scanner.nextLine();

        }





    }
}
