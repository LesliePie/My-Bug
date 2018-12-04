package proxy;

import java.lang.reflect.Proxy;

/**
 * @program: oprate-AliYun
 * @description: 主方法
 * @author: Leslie
 * @create: 2018-12-03 11:18
 **/
public class ProxyTest {
    /**
     * jdk代理
     * @param args
     */
    public static void main(String[] args) {

        //被代理的类
        BuyticketImpl buyticket=new BuyticketImpl();
        //代理类
        ProxyBuyTicket proxyBuyTicket=new ProxyBuyTicket(buyticket);
        //生成代理对象
        IBuyticket iBuyticket= (IBuyticket) Proxy.newProxyInstance(BuyticketImpl.class.getClassLoader(),new Class[]{IBuyticket.class},proxyBuyTicket);
        iBuyticket.buyTicket();
    }

}
