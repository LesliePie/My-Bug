package design_model.structural.composite;

/**
 * @program: MyStudy
 * @description: 文本文件
 * @author: Leslie
 * @create: 2018-12-18 16:40
 **/
public class TextFile extends File{


    public TextFile(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("这是文本文件，文件名:"+super.name);
    }
}
