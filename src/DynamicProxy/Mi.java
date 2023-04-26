package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Mi implements InvocationHandler {
    private Object object;

    public Mi(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object resultv= method.invoke(object,args);
        if(method.getName().equals("buy")){
            System.out.println("小米");
            System.out.println("result"+"="+resultv);
        }
        return resultv;
    }
}
