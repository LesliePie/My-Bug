package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description:
 * @author: Leslie
 * @create: 2018-12-06 14:40
 **/
public class AppleBImpl implements IApple {
    @Override
    public void taste() {
        System.out.println("B苹果味");
    }

    @Override
    public void color() {
        System.out.println("B 红色");
    }
}
