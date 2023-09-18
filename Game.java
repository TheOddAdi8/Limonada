import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("");
        Scanner nameBot = new Scanner(System.in);
        String userName = nameBot.nextLine();

        Beginning beginner = new Beginning();
        beginner.begin(userName);

        Instructions instructor = new Instructions();
        instructor.instruct();

        nameBot.close();
    }
}