package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: B 香蕉
 * @author: Leslie
 * @create: 2018-12-06 14:25
 **/
public class BananaTypeBImpl implements IBanana {
    @Override
    public void taste() {
        System.out.println("B香蕉味");
    }

    @Override
    public void name() {
        System.out.println("香蕉B");
    }
}
