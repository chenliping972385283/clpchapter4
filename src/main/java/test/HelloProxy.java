package test;

/**
 * Created by jinli on 2016/8/25.
 */
public class HelloProxy implements Hello{

    private Hello hello;
    public HelloProxy(){
        hello = new HelloImpl();
    }

    public void say(String name){
        before();
        hello.say(name);
        after();
    }

    public void after(){
        System.out.println("after");
    }

    public void before(){
        System.out.println("before ");
    }

    public static void main(String[] args){
        Hello helloProxy = new HelloProxy();
        helloProxy.say("clp");
    }
}
