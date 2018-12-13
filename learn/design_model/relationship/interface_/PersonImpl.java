package design_model.relationship.interface_;

/**
 * @program: oprate-AliYun
 * @description: 人类实现接口
 * @author: Leslie
 * @create: 2018-12-04 10:54
 **/
public class PersonImpl implements IPerson{
    @Override
    public void eat(IAnimal iAnimal) {
       String meat= iAnimal.byMeating();
       System.out.println("我吃了"+meat);
    }
}
