package design_model.creational.simple_factory;

/**
 * @program: MyStudy
 * @description: 水果工厂类
 * @author: Leslie
 * @create: 2018-12-05 15:41
 **/
public class FruitFactory {

    public static Fruit getFruit(String type){
        //忽略大小写
        if ("banana".equalsIgnoreCase(type)){
            return new FruitBanalaImpl();
        }else if ("apple".equalsIgnoreCase(type)){
            return new FruitAppleImpl();
        }else{
            throw new FruitNotFoundException("未找到该类水果");
        }
    }
}
