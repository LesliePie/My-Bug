package design_model.creational.prototype_pattern.simple;

import java.io.*;

/**
 * @program: MyStudy
 * @description: 具体原型
 * @author: Leslie
 * @create: 2018-12-13 16:09
 **/
public class Email implements Cloneable,Serializable {
    private static final long serialVersionUID = 7133830489560924359L;
    private String text;
    private String name;
    private Other other;
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制失败");
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 深克隆
     * @return
     */
    public Object deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Email{" +
                "text='" + text + '\'' +
                ", name='" + name + '\'' +
                ", other=" + other +
                '}';
    }
}
