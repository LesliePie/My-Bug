import sun.applet.AppletClassLoader;

import java.util.Random;

/**
 * @program: oprate-AliYun
 * @description: classLoader
 * @author: Leslie
 * @create: 2018-11-28 14:49
 **/
public class ClassLoaderTest {

    public static void main(String args[]){
        ClassLoaderTest classLoaderTest=new ClassLoaderTest();
        classLoaderTest.loadClass();
    }

    public void stringloader(){
        ClassLoader classLoader=String.class.getClassLoader();
        System.out.println("String的类加载器"+classLoader.toString());
    }
    public void utillLoader(){
        ClassLoader classLoader=Random.class.getClassLoader();
        System.out.println("Radom的加载器"+classLoader.toString());
    }
    public void myLoader(){
        ClassLoader classLoader=this.getClass().getClassLoader();
        System.out.println("当前类的加载器"+classLoader);
        System.out.println(classLoader.getParent().toString());
        System.out.println(classLoader.getParent().getParent().toString());
    }
    public void loadClass(){
        String xx="";
        try {
            Class<?> str=Class.forName("java.lang.String",true,ClassLoaderTest.class.getClassLoader().getParent().getParent());
            xx=str.getTypeName();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(xx);
    }
}
