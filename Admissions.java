import java.util.Scanner;

public class Admissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your last name?");
        String name = scanner.next();
        System.out.println("What is your SAT Score?");
        int sat = scanner.nextInt();
        System.out.println("What is your Class Rank percentile?");
        int cr = scanner.nextInt();
        System.out.println("How many awards have you earned?");
        int awards = scanner.nextInt();
        System.out.println("Where do you live?");
        String location = scanner.next();
        int satRating = 0;
        int crRating = 0;
        int awardsRating = 0;
        int locationRating = 0;
        String admission = "";
        String reason = "";



        if (sat > 1500) {
            satRating = 1; //1 is Elite rating
        } else if (sat <= 1499 && sat >= 1400) {
            satRating = 2; //2 is Solid Rating
        } else if (sat <= 1200 && sat >= 1399) {
            satRating = 3; //3 is Acceptable Rating
        } else {
            satRating = 4; //4 is Nope
        }
        if (cr > 95) {
            crRating = 1;
        } else if (cr <= 95 && cr >= 90) {
            crRating = 2; 
        } else if (cr <= 90 &&cr >= 85) {
            crRating = 3; 
        } else {
            crRating = 4; 
        }
        if (awards >= 10) {
            awardsRating = 1;
        } else if (awards <= 9 && awards >= 8) {
            awardsRating = 2; 
        } else if (awards <= 7 && awards >= 3) {
            awardsRating = 3; 
        } else {
            awardsRating = 4;
        }
        
        if (location.equals("Colorado")) {
            locationRating = 1;
        } else if (location.equals("Florida")) {
            locationRating = 4; 
        } else {
            locationRating = 3;
        }
        
        if (satRating == 1 || crRating == 1 || awardsRating == 1 || locationRating == 1 || name.equals("Padjen")) {
            admission = "Admitted";
            reason = "You are elite in 1 or more area";
        } else if (satRating == 2 || crRating == 1 || awardsRating == 1 || locationRating == 1 ) {
            admission = "Admitted";
            reason = "You are solid in 2 or more area";
        } else if (satRating == 1 || crRating == 1 || awardsRating == 1 || locationRating == 1 ) {
            admission = "Admitted";
            reason = "";
        }

        
        
    }
}