package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: B 类水果工厂
 * @author: Leslie
 * @create: 2018-12-06 15:25
 **/
public class FruitBFactory extends FruitFactory{
    @Override
    IBanana getBanana() {
        return new BananaTypeBImpl();
    }

    @Override
    IApple getApple() {
        return new  AppleBImpl();
    }
}
