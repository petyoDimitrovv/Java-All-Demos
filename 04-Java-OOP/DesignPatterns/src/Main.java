public class Main {
    public static void main(String[] args) {
        SingletonCounter singleton = SingletonCounter.getInstance();
        singleton.getCounter().put("Sofia", 200000);
        int sofia = singleton.getPopulation(singleton.getCounter(), "Sofia");
        System.out.println(sofia );
    }
}
