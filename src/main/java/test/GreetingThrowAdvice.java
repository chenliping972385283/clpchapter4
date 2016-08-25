package test;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by jinli on 2016/8/25.
 */
public class GreetingThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method,Object[] objects,Object target,Exception e){

        System.out.println("------------throwException---------");
        System.out.println("target class:" + target.getClass().getName());
        System.out.println("Method:name:" + method.getName());
        System.out.println("Exception name:" + e.getStackTrace());
        System.out.println("--------------------------------");
    }


}
