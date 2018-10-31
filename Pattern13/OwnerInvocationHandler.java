package Pattern13;

import java.lang.reflect.*;

public class OwnerInvocationHandler implements InvocationHandler{
    personBean person;

    public OwnerInvocationHandler(personBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().startsWith("get")||method.getName().startsWith("set")&&!method.getName().equals("setHotRate")){
            return method.invoke(person,args);
        }else
            throw new IllegalAccessException();
    }
}
