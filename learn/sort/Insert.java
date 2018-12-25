package sort;

import java.util.Arrays;

/**
 * @program: MyStudy
 * @description: 插入排序
 * @author: Leslie
 * @create: 2018-12-21 14:07
 **/
public class Insert {
    public static void main(String[] args) {
        Insert insert=new Insert();
        insert.sort();
    }

    public void sort(){
        int [] arr={8,7,9,6,2,1,5,3};
        for (int i=1;i<arr.length;i++){
            System.out.println("第"+i+"次交换");
            if (arr[i]<arr[i-1]){
                int min=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=min;
                System.out.println("排序===:"+Arrays.toString(arr));
                for (int j=i-1;j>=1;j--){
                    System.out.println("第"+i+"次第"+j+"交换");
                    if (arr[j]<arr[j-1]){
                        int temp=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        System.out.println("再排===:"+Arrays.toString(arr));
                    }
                }
            }
        }
    }
}
