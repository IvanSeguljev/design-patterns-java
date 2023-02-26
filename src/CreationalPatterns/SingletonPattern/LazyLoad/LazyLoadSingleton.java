package CreationalPatterns.SingletonPattern.LazyLoad;

public class LazyLoadSingleton {
    private static LazyLoadSingleton lazyLoadSingleton;

    private LazyLoadSingleton(){};
    //synchronization required in case 2 thread try to call method at the same time, and cause instance to be instantiated twice
    public static LazyLoadSingleton getInstance(){
        if(lazyLoadSingleton == null) {
            synchronized (LazyLoadSingleton.class) {
                if (lazyLoadSingleton == null)
                    lazyLoadSingleton = new LazyLoadSingleton();
            }
        }
        return lazyLoadSingleton;
    }
}
