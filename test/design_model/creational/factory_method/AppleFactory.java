package design_model.creational.factory_method;

/**
 * @program: MyStudy
 * @description: 苹果工厂
 * @author: Leslie
 * @create: 2018-12-05 16:30
 **/
public class AppleFactory extends AbstractFactory{
    @Override
    public Fruit getFruit() {
        return new FruitAppleImpl();
    }
}
