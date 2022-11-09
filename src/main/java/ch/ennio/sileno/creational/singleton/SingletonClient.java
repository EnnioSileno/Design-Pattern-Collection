package ch.ennio.sileno.creational.singleton;

public class SingletonClient {

    public static void main(String[] args) {
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance();
        System.out.println(simpleSingleton);
        System.out.println("Is the same instance: " + simpleSingleton.equals(SimpleSingleton.getInstance()));

        SingletonThreadSafePerformance simpleSingletonPerformance = SingletonThreadSafePerformance.getInstance();
        System.out.println(simpleSingletonPerformance);
        System.out.println("Is the same instance: " + simpleSingletonPerformance.equals(SingletonThreadSafePerformance.getInstance()));
    }
}
