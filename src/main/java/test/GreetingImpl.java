package test;

/**
 * Created by jinli on 2016/8/25.
 */
public class GreetingImpl implements Greeting{


    public void sayHello(String name) {
       /// before();
        System.out.println("Hello" + name);
        throw new RuntimeException("error");
       // after();
    }

    public void after(){
        System.out.println("after");
    }

    public void before(){
        System.out.println("before ");
    }
}
