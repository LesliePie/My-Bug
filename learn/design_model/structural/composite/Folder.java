package design_model.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: MyStudy
 * @description: 文件夹类
 * @author: Leslie
 * @create: 2018-12-18 16:37
 **/
public class Folder extends File{
    private List<File> files;

    public Folder(String name) {
        super(name);
        files=new LinkedList<>();
    }

    /**
     * 添加文件
     * @param file
     */
    public void addFiles(File file){
        files.add(file);
    }
    public void removeFile(File file){
        files.remove(file);
    }

    @Override
    void display() {
        for (File item:files){
            item.display();
        }
    }
}
