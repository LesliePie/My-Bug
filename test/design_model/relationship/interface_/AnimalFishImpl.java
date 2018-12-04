package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description:
 * @author: Leslie
 * @create: 2018-12-04 10:46
 **/
public class AnimalFishImpl implements IAnimal {
    @Override
    public void move() {
        System.out.println("水里游动");
    }

    @Override
    public String byMeating() {
        return "鱼肉";
    }


}
