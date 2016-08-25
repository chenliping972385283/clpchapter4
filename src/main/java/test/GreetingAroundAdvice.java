package test;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by jinli on 2016/8/25.
 */
public class GreetingAroundAdvice implements MethodInterceptor {


    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        before();
        Object result = methodInvocation.proceed();
        after();
        return null;
    }

    public void after(){
        System.out.println("after");
    }

    public void before(){
        System.out.println("before ");
    }

}
