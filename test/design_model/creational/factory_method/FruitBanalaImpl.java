package design_model.creational.factory_method;


/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-05 12:04
 **/
public class FruitBanalaImpl implements Fruit {
    @Override
    public void grow() {
        System.out.println("香蕉长");
    }

    @Override
    public void taste() {
        System.out.println("甜的");
    }

    public void color(){
        System.out.println("黄色");
    }
}
