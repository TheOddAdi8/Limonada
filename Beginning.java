import java.util.concurrent.TimeUnit;

public class Beginning {

    public static void wait(int num) {
        try {
            TimeUnit.SECONDS.sleep(num);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void begin(String name) {
        System.out.println("\nLIMONADA");
        wait(1);
        System.out.println("Hi " + name + ", welcome to limonada!");
        System.out.println("(Press enter to continue)");
    }
}
