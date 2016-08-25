package test;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;


/**
 * Created by jinli on 2016/8/25.
 */
public class GreetingIntroAdvice extends DelegatingIntroductionInterceptor  implements Apology{

    public Object invoke(MethodInvocation invocation)throws Throwable{
        return super.invoke(invocation);
    }

    public void saySorry(String name) {
        System.out.println("Sorry!" + name);
    }
}
