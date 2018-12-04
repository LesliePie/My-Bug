package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description:
 * @author: Leslie
 * @create: 2018-12-04 10:45
 **/
public class AnimalDogImpl implements IAnimal {
    @Override
    public void move() {
        System.out.println("4只脚跑");
    }

    @Override
    public String byMeating() {
        return "狗肉";
    }
}
