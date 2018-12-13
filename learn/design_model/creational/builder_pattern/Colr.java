package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 可乐
 * @author: Leslie
 * @create: 2018-12-06 17:30
 **/
public class Colr {
    private String name;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Colr{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
