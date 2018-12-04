package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description:
 * @author: Leslie
 * @create: 2018-12-04 10:57
 **/
public class InterfaceTest {
    public static void main(String[] args) {
        IPerson person=new PersonImpl();
        //IAnimal iAnimal=new AnimalDogImpl();
        IAnimal iAnimal=new AnimalFishImpl();
        person.eat(iAnimal);
    }
}
