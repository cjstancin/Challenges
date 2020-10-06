import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args) {
        Random diceGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times would you like to run this simulation?");
        int n = scanner.nextInt();
        int min = 1;
        int max = 6;
        int score = 0;
        int x = 0;

        while (x > 0) {
            System.out.println("your new score is " + score);
            int dice1 = diceGenerator.nextInt(max);
            int dice2 = diceGenerator.nextInt(max);
            n--;
            if (dice1 == dice2) {
                System.out.println("You got Snake Eyes, your turn is over");
                n = 0;
            } else {
                System.out.println(dice1);
                System.out.println(dice2);
                score = score + (dice1 + dice2);
            }
        }
        System.out.println("Your score is " + score);
    }
}