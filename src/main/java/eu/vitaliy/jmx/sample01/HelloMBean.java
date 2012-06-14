package eu.vitaliy.jmx.sample01;

/**
 * Created with IntelliJ IDEA.
 * User: xaoc
 * Date: 15.06.12
 * Time: 01:04
 * To change this template use File | Settings | File Templates.
 */
public interface HelloMBean
{
    public void setMessage(String message);
    public String getMessage();
    public void sayHello();
}