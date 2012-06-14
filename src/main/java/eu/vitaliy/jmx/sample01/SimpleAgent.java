package eu.vitaliy.jmx.sample01;
import javax.management.*;
import java.lang.management.*;

public class SimpleAgent
{
    private MBeanServer mbs = null;

    public SimpleAgent()
    {
        // Получить экземпляр MBeanServer
        mbs = ManagementFactory.getPlatformMBeanServer();

        // Создаем наш MBean
        Hello helloBean = new Hello();
        ObjectName helloName = null;

        try {
            // И регистрируем его на платформе MBeanServer
            helloName = new ObjectName("SimpleAgent:name=hellothere");
            mbs.registerMBean(helloBean, helloName);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // Это вспомогательный метод – он позволяет нашей программе
    // остановиться и ждать
    private static void waitForEnterPressed()
    {
        try {
            System.out.println("Press  to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String argv[])
    {
        SimpleAgent agent = new SimpleAgent();
        System.out.println("SimpleAgent is running...");
        SimpleAgent.waitForEnterPressed();
    }
}
