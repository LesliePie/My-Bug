package design_model.creational.singleton;

/**
 * @program: MyStudy
 * @description: 双重锁校验
 * @author: Leslie
 * @create: 2018-12-17 15:03
 **/
public class SingletonDoubleCheck {
    /**
     * 采用双锁机制达到， 达到了线程安全，懒加载，
     */

    private volatile static SingletonDoubleCheck singletonDoubleCheck;

    private SingletonDoubleCheck() {
    }

    public static SingletonDoubleCheck getInstance(){
        if (singletonDoubleCheck==null){
            synchronized (SingletonDoubleCheck.class){
                if (singletonDoubleCheck==null){
                    singletonDoubleCheck=new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}
