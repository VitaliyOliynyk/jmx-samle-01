package eu.vitaliy.jmx.sample01;

/**
 * Created with IntelliJ IDEA.
 * User: xaoc
 * Date: 15.06.12
 * Time: 00:57
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        waitForEnterPressed();

    }

    private static void waitForEnterPressed()
    {
        try {
            System.out.println("Press  to continue...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
