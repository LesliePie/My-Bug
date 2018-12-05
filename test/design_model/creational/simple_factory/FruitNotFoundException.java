package design_model.creational.simple_factory;

/**
 * @program: MyStudy
 * @description: 找不到该类的异常
 * @author: Leslie
 * @create: 2018-12-05 15:45
 **/
public class FruitNotFoundException extends RuntimeException{

    public FruitNotFoundException(String message) {
        super(message);
    }
}
