package design_model.creational.prototype_pattern.simple;

import java.io.Serializable;

/**
 * @program: MyStudy
 * @description: 增加一个引用对象
 * @author: Leslie
 * @create: 2018-12-13 16:21
 **/
public class Other implements Serializable {
    private static final long serialVersionUID = 359811609519912479L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Other{" +
                "name='" + name + '\'' +
                '}';
    }
}
