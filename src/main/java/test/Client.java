package test;

import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by jinli on 2016/8/25.
 */
public class Client {

    public static void main(String[] args){

        /*ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterAdvice());
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("clp");*/

       /* ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAndAfterAdvice() );
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("clp");*/

       /*ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingThrowAdvice() );
        Greeting greeting = (Greeting) proxyFactory.getProxy();
        greeting.sayHello("clp");*/

        ProxyFactory proxyFactory = new ProxyFactory();
      //  proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingIntroAdvice() );
        Apology greeting = (Apology) proxyFactory.getProxy();
        greeting.saySorry("pmk");

        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.application.xml");
        Greeting greeting = context.getBean("greetingProxy");
        greeting.sayHello("Hello");*/

       /* ApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        GreetingImpl greetingImpl = context.getBean("greetingProxy");
        greeting.sayHello("pmk");
        Apology apology = (Apology) greetingImpl;
        apology.saySorry("yt");*/
    }

}
