package DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Mobile mobile = new RedMi();
        Mi mi = new Mi(mobile);

        ClassLoader loader = mobile.getClass().getClassLoader();
        Mobile mobile1 = (Mobile) Proxy.newProxyInstance(loader,new Class[]{Mobile.class},mi);
        mobile1.buy();
    }
}
