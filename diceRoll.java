public class diceRoll {
    public static void main(String[] args) {

        int min = 3;
        int max = 3;

        for (int i = 0; i < 1000; i++) {
            int roll = (int)(Math.random()*6) + 1;
            System.out.print(roll + " ");
            
            if (roll < min) {
                min = roll;
            }
            if (roll > max) {
                max = roll;
            }
        }

        System.out.println("\n\nMax is " + max + " and min is " + min);

    }
}
