package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: A 品种苹果
 * @author: Leslie
 * @create: 2018-12-06 14:39
 **/
public class AppleAImpl implements IApple {
    @Override
    public void taste() {
        System.out.println("A 苹果味");
    }

    @Override
    public void color() {
        System.out.println("A 苹果色");
    }
}
