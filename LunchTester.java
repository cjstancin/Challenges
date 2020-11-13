public class LunchTester {
    public static void main(String[] args) {
    LunchAccount student1 = new LunchAccount("charles", 30.00);
    System.out.println(student1);
    
    student1.addMoney(20);
    System.out.println(student1);
    }
}