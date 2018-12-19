package design_model.structural.composite;

/**
 * @program: MyStudy
 * @description: 文件抽象类
 * @author: Leslie
 * @create: 2018-12-18 16:35
 **/
public abstract class File {

    String name;

    public File(String name) {
        this.name = name;
    }

    abstract void display();

}
