import java.util.Random;
import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args) {
        Random diceGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times would you like to run this simulation?");
        int n = scanner.nextInt();
        int rolles = 0;
        int denominator = n;
        int max = 5;
        int score = 0;
        int avgscore = 0;
        int avgrolles = 0;
        int ifMore4 = 0;

            while (n > 0) {
                int dice1 = diceGenerator.nextInt(max) + 1; 
                int dice2 = diceGenerator.nextInt(max) + 1;
                rolles++;
                if (dice1 == dice2) {
                    avgrolles = avgrolles + rolles;
                    if (rolles > 4) {
                        ifMore4 = ifMore4 + 1;
                        System.out.println();
                    }
                    score = 0;
                    rolles = 0;
                    n = n - 1;
                } else {
                    score = score + (dice1 + dice2);
                    avgrolles = avgrolles + rolles;
                    avgscore = avgscore + score;
                }
            }
        avgscore = avgscore / denominator;
        avgrolles = avgrolles / denominator;
        double percent4 = (ifMore4 / Double.valueOf(denominator)) * 100;
        System.out.println("The average score is " + avgscore);
        System.out.println("The average roles are " + avgrolles);
        System.out.println("The percent of players with more than 4 roles are " + percent4 + "%");
    }
}