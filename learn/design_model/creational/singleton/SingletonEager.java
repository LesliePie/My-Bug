package design_model.creational.singleton;

/**
 * @program: MyStudy
 * @description: 饿汉式
 * @author: Leslie
 * @create: 2018-12-17 14:59
 **/
public class SingletonEager {
    /**
     * 饿汉式：没有加锁，执行效率高，但是容易产生垃圾对象，类加载的时候进行初始化，浪费内存。
     * 它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，
     * 虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getInstance 方法，
     * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
     * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
     */


    private static SingletonEager singletonEager=new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance(){
        return singletonEager;
    }
}
