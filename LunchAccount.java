public class LunchAccount {
    private String student;
    private double balance;
    private int id;
    private int lunchesBought;
    private double moneySpent;
    private static int startId = 1000;
    private static int studentsFirstAdded = 0;

    public LunchAccount(String student, double balance) {
        this.student = student;
        this.balance = balance;
        this.id = startId;
        startId++;
    }

    public LunchAccount(String student) {
        this.student = student;
        this.balance = 0;
    }

    public String getStudent() {return student;}
    public double getBalance() {return balance;}

    public boolean mealPrice(double meal) {
        if (meal <= balance) {
            balance = balance - meal;
            moneySpent += meal;
            return true;
        } else {
            return false;
        }

    }
    
    public void addMoney(double money) {
        if (money > 0) {
            if (this.balance == 0) {
                studentsFirstAdded = studentsFirstAdded + 1;
                if(studentsFirstAdded < 100) {
                    this.balance += 20;
                }
            }
            this.balance += money;
        }
    }

    public String ToString() {
        return "name: " + student + "\nid: " + id + "\nBalance: $" + balance + "\nMoney Spent: $" + moneySpent;
    }


}