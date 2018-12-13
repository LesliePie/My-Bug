package design_model.relationship.composition;

/**
 * @program: oprate-AliYun
 * @description: 人类拥有头发
 * @author: Leslie
 * @create: 2018-12-03 17:42
 **/
public class Person {
    private Hair hair;

    public Person() {
        hair=new Hair();
    }
}
