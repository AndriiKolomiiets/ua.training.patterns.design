package patterns.creational.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(Singleton.getCountOfInstance());
    }
}
