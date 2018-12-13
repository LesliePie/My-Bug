package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 薯条(产品实体)
 * @author: Leslie
 * @create: 2018-12-06 17:33
 **/
public class Chips {
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "size='" + size + '\'' +
                '}';
    }
}
