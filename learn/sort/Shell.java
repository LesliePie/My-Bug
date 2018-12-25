package sort;

import java.util.Arrays;

/**
 * @program: MyStudy
 * @description: 希尔排序
 * @author: Leslie
 * @create: 2018-12-21 14:32
 **/
public class Shell {

    public static void main(String[] args) {
        Shell shell=new Shell();
        shell.sort();
    }


    public void sort(){
        int [] arr={8,7,9,6,2,1,5,3};
        int step=arr.length/2;
        while (step>=1){
            System.out.println("步长为"+step+"的排序");
            for (int i=0;(step+i)<arr.length;i++){
                if (arr[i]>arr[i+step]){
                    int temp=arr[i];
                    arr[i]=arr[i+step];
                    arr[i+step]=temp;
                    System.out.println("排序后:"+Arrays.toString(arr));
                }
            }
                step=step/2;
        }
    }
}
