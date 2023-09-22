import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {

    public static void wait(int num) {
        try {
            TimeUnit.SECONDS.sleep(num);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner blank = new Scanner(System.in);
        Scanner usefulBot = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        Scanner nameBot = new Scanner(System.in);
        String userName = nameBot.nextLine();

        Beginning beginner = new Beginning();
        beginner.begin(userName);
        String enter = blank.nextLine();

        System.out.println("If you need help, type 'help'.\nGood luck!\n");

        wait(1);

        System.out.println("GAME BEGINS\n");

        for (int i = 0; i >= 0; i++) {
            
        }
        
        wait(1);

        Instructions instructor = new Instructions();
        instructor.instruct();
        enter = blank.nextLine();

        nameBot.close();
        usefulBot.close();
        blank.close();
    }
}