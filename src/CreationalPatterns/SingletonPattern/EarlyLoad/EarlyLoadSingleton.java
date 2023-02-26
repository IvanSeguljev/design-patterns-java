package CreationalPatterns.SingletonPattern.EarlyLoad;

public class EarlyLoadSingleton {
    private static final EarlyLoadSingleton earlyLoadSingleton = new EarlyLoadSingleton();

    public EarlyLoadSingleton getInstance(){
        return earlyLoadSingleton;
    }
}
