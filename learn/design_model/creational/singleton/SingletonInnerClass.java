package design_model.creational.singleton;

/**
 * @program: MyStudy
 * @description: 静态内部类
 * @author: Leslie
 * @create: 2018-12-17 15:13
 **/
public class SingletonInnerClass {
    /**
     * 登记式/线程内部类
     * 线程安全
     * lazy 初始化
     * 对静态域使用延迟初始化，应该使用这种方式
     * 利用了 classloader 机制来保证初始化 instance 时只有一个线程，
     * 它跟 双锁加载 方式不同的是：双锁加载方式只要 Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，instance 不一定被初始化。
     * 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance。
     * 想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 Singleton 类加载时就实例化，
     * 因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。这个时候，这种方式相比双锁加载方式就显得很合理。
     */
    private static class SingletonHolder{
        private static final SingletonInnerClass INNER_CLASS=new SingletonInnerClass();
    }

    private SingletonInnerClass() {
    }

    public static final SingletonInnerClass getInstance(){
        return SingletonHolder.INNER_CLASS;
    }
}
