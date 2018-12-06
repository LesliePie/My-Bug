package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-06 15:26
 **/
public class Test {

    public static void main(String[] args) {
        FruitFactory fruitFactory=new FruitBFactory();
        FruitBasket basket=new FruitBasket(fruitFactory);
        basket.getPresent();
    }
}
