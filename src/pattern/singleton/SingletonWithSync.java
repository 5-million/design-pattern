package pattern.singleton;

public class SingletonWithSync {
    private static SingletonWithSync instance;

    private SingletonWithSync() {}

    public static synchronized SingletonWithSync getInstance() {
        if (instance == null)
            instance = new SingletonWithSync();

        return instance;
    }
}
