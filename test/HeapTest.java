/**
 * @program: oprate-AliYun
 * @description: 堆
 * @author: Leslie
 * @create: 2018-11-28 15:41
 **/
public class HeapTest {
    public    String name="初始化";
    public static void main(String[] args){
        HeapTest heapTest=new HeapTest();
        System.out.println(heapTest.name);
        ThreadTwo threadTwo=   new ThreadTwo(heapTest);
        ThreadOne threadOne= new ThreadOne(heapTest);
        threadOne.start();
        threadTwo.start();
        new Thread(()-> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("最后结果:"+heapTest.name);
        }).start();

    }

    /**
     * 一个线程定义80,常量池里面有了80,另一个去堆中常量池去取，两个对象相等
     */
    public void lambdaThred(){
        new Thread(() -> {
            System.out.println("我是线程1");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer xx=80;
            System.out.println("线程1："+System.identityHashCode(xx));
        }).start();
        new Thread(() -> {
            System.out.println("我是线程2");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Integer xx=80;
            System.out.println("线程2："+System.identityHashCode(xx));
        }).start();
    }
}
