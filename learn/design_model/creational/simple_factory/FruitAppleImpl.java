package design_model.creational.simple_factory;

/**
 * @program: MyStudy
 * @description: 其中一种水果苹果
 * @author: Leslie
 * @create: 2018-12-05 12:03
 **/
public class FruitAppleImpl implements Fruit {
    @Override
    public void grow() {
        System.out.println("苹果成长");
    }

    @Override
    public void taste() {
        System.out.println("脆的");
    }

    public void shape(){
        System.out.println("苹果是红色的");
    }
}
