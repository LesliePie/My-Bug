package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description: 狗接口 继承动物接口
 * @author: Leslie
 * @create: 2018-12-04 10:48
 **/
public interface IDog extends IAnimal {

    void eat();

    @Override
    void move();
}
