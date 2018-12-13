package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: oprate-AliYun
 * @description: 代理买票
 * @author: Leslie
 * @create: 2018-12-03 11:15
 **/
public class ProxyBuyTicket implements InvocationHandler {

    private final BuyticketImpl target;

    public ProxyBuyTicket(BuyticketImpl target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理买票");
        Object res = method.invoke(target, args);
        return res;
    }
}
