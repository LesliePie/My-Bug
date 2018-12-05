package design_model.creational.factory_method;

/**
 * @program: MyStudy
 * @description: 香蕉工厂
 * @author: Leslie
 * @create: 2018-12-05 16:21
 **/
public class BananaFactory extends AbstractFactory{
    /**
     * 香蕉工厂返回香蕉
     * @return
     */
    @Override
    public Fruit getFruit() {
        return new FruitBanalaImpl();
    }
}
