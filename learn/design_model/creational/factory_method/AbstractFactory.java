package design_model.creational.factory_method;

/**
 * @program: MyStudy
 * @description: 抽象的工厂
 * @author: Leslie
 * @create: 2018-12-05 16:22
 **/
public abstract class AbstractFactory {
    /**
     * 抽象的获取产品的方法
     * @return
     */
    public abstract Fruit getFruit();
}
