import java.lang.reflect.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        Reflection reflection = new Reflection();

        Class<Reflection> clazz = Reflection.class;

        Field[] declaredField = Arrays.stream(clazz.getDeclaredFields())
                .sorted(Comparator.comparing(Field::getName))
                .toArray(Field[]::new);
        for (Field field : declaredField) {
            if (!Modifier.isPrivate(field.getModifiers())){
                System.out.println(field.getName() + " must be private!");
            }

        }

        Method[] methods = clazz.getDeclaredMethods();

        List<Method> getters = new ArrayList<>();

        List<Method> setters = new ArrayList<>();

        for (Method method : methods) {
            if(method.getName().startsWith("get")){
                getters.add(method);
            }else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }
        getters.sort(Comparator.comparing(Method::getName));
        setters.sort(Comparator.comparing(Method::getName));

        for (Method getter : getters) {
            if(!Modifier.isPublic(getter.getModifiers())){
                System.out.println(getter.getName() + " must be public!");
            }


        }
        for (Method setter : setters) {
            if(!Modifier.isPrivate(setter.getModifiers())){
                System.out.println(setter.getName() + " must be private!");
            }


        }
    }
}
