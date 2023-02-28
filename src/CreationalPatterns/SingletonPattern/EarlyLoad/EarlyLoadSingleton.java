package CreationalPatterns.SingletonPattern.EarlyLoad;

public class EarlyLoadSingleton {
    private static final EarlyLoadSingleton earlyLoadSingleton = new EarlyLoadSingleton();

    public static EarlyLoadSingleton getInstance(){
        return earlyLoadSingleton;
    }
}
