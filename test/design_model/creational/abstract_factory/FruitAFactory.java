package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: A类水果工厂
 * @author: Leslie
 * @create: 2018-12-06 15:22
 **/
public class FruitAFactory extends FruitFactory{
    @Override
    IBanana getBanana() {
        return new BananaTypeAImpl();
    }

    @Override
    IApple getApple() {
        return new AppleAImpl();
    }
}
