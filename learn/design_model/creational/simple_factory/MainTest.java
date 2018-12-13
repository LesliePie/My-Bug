package design_model.creational.simple_factory;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-05 15:47
 **/
public class MainTest {
    public static void main(String[] args) {
        //此处 banana 可以通过xml等配置的方式进行实现，达到不修改代码的目的而实现
        Fruit fruit=FruitFactory.getFruit("banana");
        fruit.grow();
    }
}
