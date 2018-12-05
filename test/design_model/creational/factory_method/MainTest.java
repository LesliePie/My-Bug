package design_model.creational.factory_method;


import design_model.creational.simple_factory.FruitFactory;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-05 15:47
 **/
public class MainTest {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        try {
            //通过配置文件。通过反射机制进行创建
            Object o=Class.forName("design_model.creational.factory_method.BananaFactory").newInstance();
            abstractFactory= (AbstractFactory) o;
            Fruit fruit=abstractFactory.getFruit();
            fruit.taste();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
