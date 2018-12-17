package design_model.creational.singleton;

/**
 * @program: MyStudy
 * @description: 懒汉式, 线程安全
 * @author: Leslie
 * @create: 2018-12-17 14:48
 **/
public class SingletonLazySyn {
    /**
     * 线程安全的懒汉式： 能在多线程的情况下工作，但是工作效率比较低，99%需要进行同步
     * 优点：需要的时候才进行调用，避免了内存浪费
     * 缺点，要加锁了才能保证单例，但是加锁会影响效率
     */
    private static SingletonLazySyn syn;

    private SingletonLazySyn() {
    }

    /**
     * 加了锁，线程安全
     * @return
     */
    public static synchronized SingletonLazySyn getInstance() {
        if (syn == null) {
            syn = new SingletonLazySyn();
        }
        return syn;
    }
}
