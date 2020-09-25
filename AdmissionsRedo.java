import java.util.Scanner;

public class AdmissionsRedo{
    public static void main(String[] args){
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
        String admission = "";
        int elite = 0;
        int solid = 0;
        int acceptable = 0;
        int nope = 0;
        
        if (sat > 1500) {
            elite = elite + 1;
        } else if (sat <= 1499 && sat >= 1400) {
            solid = solid + 1;
        } else if (sat <= 1200 && sat >= 1399) {
            acceptable = acceptable + 1;
        } else {
            nope = nope + 1;
        }
        if (cr > 95) {
            elite = elite + 1;
        } else if (cr <= 95 && cr >= 90) {
            solid = solid + 1;
        } else if (cr <= 90 &&cr >= 85) {
            acceptable = acceptable + 1;
        } else {
            nope = nope + 1;
        }
        if (awards >= 10) {
            elite = elite + 1;
        } else if (awards <= 9 && awards >= 8) {
            solid = solid + 1;
        } else if (awards <= 7 && awards >= 3) {
            acceptable = acceptable + 1;
        } else {
            nope = nope + 1;
        }
        if (location.equals("Colorado")) {
            elite = elite + 1;
        } else if (location.equals("Florida")) {
           acceptable = acceptable + 1;
        } else {
            nope = nope + 1;
        }

        if (elite >= 1 || name.equals("Padjen")){
            admission = "you are admitted because you are elite in 1 or more areas or you are Padjen and then there's no explanation needed";
        } else if (solid >= 2){
            admission = "you are admitted because you are solid in 2 or more areas";
        } else if (nope > 0){
            admission = "you were not admitted because you were not accepted for one or more reasons";
        }

        System.out.println(admission);
    }
}