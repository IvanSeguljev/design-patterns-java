package CreationalPatterns.SingletonPattern.LazyLoad;
/*
    By lazy load memory model, it is referencing that there is singleton class and holder class that holds instance of singleton.
    Java will load classes only when needed, so this method leverages that by using internal class that is loaded
    when get instance is called the first time, without need for synchronization block like in other example.
 */
public class LazyLoadSingletonMemoryModel {
    private LazyLoadSingletonMemoryModel(){}
    private class InstanceHolder{
        public static final LazyLoadSingletonMemoryModel INSTANCE = new LazyLoadSingletonMemoryModel();
    }
    public static LazyLoadSingletonMemoryModel getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
