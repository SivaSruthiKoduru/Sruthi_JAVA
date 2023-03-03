package SingleTon2review;

public class Singleton {

    private static  Singleton instance;
    

    private Singleton() {
        
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton();
                }
            }
        }
        return result;
    }

    

}