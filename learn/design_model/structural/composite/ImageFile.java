package design_model.structural.composite;

/**
 * @program: MyStudy
 * @description: 图片文件
 * @author: Leslie
 * @create: 2018-12-18 16:42
 **/
public class ImageFile extends File{
    public ImageFile(String name) {
        super(name);
    }

    @Override
    void display() {
        System.out.println("这是图片文件，文件名:"+super.name);
    }

}
