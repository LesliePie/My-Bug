package design_model.creational.prototype_pattern.register;

import java.io.Serializable;

/**
 * @program: MyStudy
 * @description: 具体原型
 * @author: Leslie
 * @create: 2018-12-13 16:50
 **/
public class ConCreatePrototype implements Serializable,Cloneable {
    private static final long serialVersionUID = -8365461258878702704L;

    private String name;
    private String age;

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("copy fail");
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ConCreatePrototype{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
