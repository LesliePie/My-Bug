package design_model.creational.singleton;

/**
 * @program: MyStudy
 * @description: 懒汉式
 * @author: Leslie
 * @create: 2018-12-17 14:44
 **/
public class SingletonLazy {

    /**
     * 懒汉式:因为没有加锁，所以并不能支持多线程,属于lazyLoading
     */
    /**
     *  私有成员变量
     */
    private static SingletonLazy singletonLazy;

    /**
     * 私有构造方法
     */
    private SingletonLazy() {
    }

    /**
     * 公有构造方法
     * @return
     */
    public static SingletonLazy getSingletonLazy() {
        if(singletonLazy ==null){
            singletonLazy =new SingletonLazy();
        }
        return singletonLazy;
    }
}
