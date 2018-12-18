package design_model.structural.adapter.both;

/**
 * @program: MyStudy
 * @description: 适配器
 * @author: Leslie
 * @create: 2018-12-18 10:25
 **/
public class Adaptor implements Adaptee,Target{
    private Adaptee adaptee;
    private Target target;

    public Adaptor(Adaptee adaptee, Target target) {
        this.adaptee = adaptee;
        this.target = target;
    }

    @Override
    public void methodAdaptee() {
        adaptee.methodAdaptee();
    }

    @Override
    public void methodTarget() {
        target.methodTarget();
    }
}
