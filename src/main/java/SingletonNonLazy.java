/*
    Не ленивый Singleton в Java
 */

public class SingletonNonLazy {
    private static final SingletonNonLazy INSTANCE = new SingletonNonLazy();

    private SingletonNonLazy() {
    }

    public static SingletonNonLazy getInstance() {
        return INSTANCE;
    }
}