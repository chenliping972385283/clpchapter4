package test;

/**
 * Created by jinli on 2016/8/25.
 */
public class GreetingProxy implements Greeting {

    private GreetingImpl greetingImpl;

    public GreetingProxy(GreetingImpl greetingImpl){
        this.greetingImpl = greetingImpl;
    }

    public void sayHello(String name) {
        before();
        System.out.println("hello" + name);
        after();
    }

    public void after(){
        System.out.println("after");
    }

    public void before(){
        System.out.println("before ");
    }

    public static void main(String[] args){
        GreetingProxy greetingProxy = new GreetingProxy(new GreetingImpl());
        greetingProxy.sayHello("clp");
    }
}
