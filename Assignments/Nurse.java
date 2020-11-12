import java.util.Scanner;

public class Nurse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name");
        String name = scanner.next();
        System.out.println("Age");
        int age = scanner.nextInt();
        System.out.println("Temperature");
        Double temp = scanner.nextDouble();
        System.out.println("Blood Pressure");
        String bp = scanner.next();
        System.out.println("Has your family had a history of diabetes");
        String d = scanner.next();
        System.out.println("Discomfort from 1-10");
        int disc = scanner.nextInt();
        System.out.println("2 Symptoms");
        String symptoms = scanner.next();

        System.out.println("----------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temp);
        System.out.println("Blood Pressure: " + bp);
        System.out.println("History of Diabetes: " + d);
        System.out.println("DIscomfort level: " + disc);
        System.out.println(symptoms);
        System.out.println("----------------------");
    }
}