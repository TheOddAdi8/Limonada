import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner blank = new Scanner(System.in);
        Scanner usefulBot = new Scanner(System.in);

        System.out.print("\nEnter your name: ");
        Scanner nameBot = new Scanner(System.in);
        String userName = nameBot.nextLine();

        Beginning beginner = new Beginning();
        beginner.begin(userName);
        enter = blank.nextLine();

        System.out.println("If you need help, type 'help'.\nGood luck!\n");

        System.out.println("GAME BEGINS\n");

        for (int i = 0; i >= 0; i++) {
            
        }
        
        
        Instructions instructor = new Instructions();
        instructor.instruct();
        enter = blank.nextLine();

        nameBot.close();
        usefulBot.close();
        blank.close();
    }
}