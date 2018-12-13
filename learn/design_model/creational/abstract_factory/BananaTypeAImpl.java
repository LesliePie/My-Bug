package design_model.creational.abstract_factory;

/**
 * @program: MyStudy
 * @description: A种类香蕉
 * @author: Leslie
 * @create: 2018-12-06 14:24
 **/
public class BananaTypeAImpl implements IBanana {
    @Override
    public void taste() {
        System.out.println("A香蕉味");
    }

    @Override
    public void name() {
        System.out.println("A香蕉");
    }
}
