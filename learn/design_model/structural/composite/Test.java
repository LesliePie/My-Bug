package design_model.structural.composite;

/**
 * @program: MyStudy
 * @description: 测试
 * @author: Leslie
 * @create: 2018-12-18 16:43
 **/
public class Test {
    public static void main(String[] args) {
        //建立一个文件夹
        Folder file=new Folder("总文件夹");
        //放入两个文件，一个文件夹
        File text1=new TextFile("文本文件1");
        File image1=new ImageFile("图片文件1");
        Folder newFolder=new Folder("新建文件夹");
        file.addFiles(text1);
        file.addFiles(image1);
        file.addFiles(newFolder);
        //新建文件夹放入一个文件
        File text2=new TextFile("文本文件2");
        newFolder.addFiles(text2);
        System.out.println("--------------新建文件夹的内容------");
        newFolder.display();
        System.out.println("--------------总文件夹的内容------");
        file.display();
        newFolder.removeFile(text2);
        System.out.println("--------------删除后文件夹的内容------");
        file.display();
    }
}
