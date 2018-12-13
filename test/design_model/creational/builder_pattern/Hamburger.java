package design_model.creational.builder_pattern;

/**
 * @program: MyStudy
 * @description: 汉堡
 * @author: Leslie
 * @create: 2018-12-06 17:31
 **/
public class Hamburger {

    private  String tosate;

    private String size;

    public String getTosate() {
        return tosate;
    }

    public void setTosate(String tosate) {
        this.tosate = tosate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "tosate='" + tosate + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
