import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner blank = new Scanner(System.in);
        String enter = "";

        System.out.print("\nEnter your name: ");
        Scanner nameBot = new Scanner(System.in);
        String userName = nameBot.nextLine();

        Beginning beginner = new Beginning();
        beginner.begin(userName);
        enter = blank.nextLine();

        Instructions instructor = new Instructions();
        instructor.instruct();
        enter = blank.nextLine();

        nameBot.close();
        blank.close();
    }
}