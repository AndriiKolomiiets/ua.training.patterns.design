package patterns.creational.singleton;

public class Singleton {
    private static Singleton instance;
    private static int countOfInstance = 0;
    private Singleton(){ countOfInstance++;}

    public static synchronized Singleton getInstance(){
        if (instance==null){
            return instance = new Singleton();
        } else {
            return instance;
        }
    }

    public static int getCountOfInstance() {
        return countOfInstance;
    }
}
