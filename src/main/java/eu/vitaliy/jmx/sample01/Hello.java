package eu.vitaliy.jmx.sample01;

/**
 * Created with IntelliJ IDEA.
 * User: xaoc
 * Date: 15.06.12
 * Time: 01:04
 * To change this template use File | Settings | File Templates.
 */
public class Hello implements HelloMBean
{
    private String message = null;

    public Hello() {
        message = "Hello there";
    }

    public Hello(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void sayHello() {
        System.out.println(message);
    }
}
