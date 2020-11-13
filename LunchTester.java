public class LunchTester {
    public static void main(String[] args) {
        LunchAccount student1 = new LunchAccount("Charles", 30.00);
        LunchAccount student2 = new LunchAccount("John");

        System.out.println(student1); //$30, $0 spent, 0 bought
        System.out.println(student2); //$0, $0 spent, 0 bought

        student1.addMoney(20);
        System.out.println(student1); //$50, $0 spent, 0 bought
        student2.addMoney(20);
        System.out.println(student2); //$40, $0 spent, 1 bought
        
        student1.mealPrice(45);
        System.out.println(student1); //$5, $45 spent, 1 bought
        student2.mealPrice(45);
        System.out.println(student2); //$40, $0 spent, 0 bought
    
        student1.addMoney(20);
        System.out.println(student1); //$25, $45 spent, 1 bought
        student1.mealPrice(15);
        System.out.println(student1); //$10, $60 spent, 2 bought
        
        
        LunchAccount student3 = new LunchAccount("Test", 0, 40);
        
        System.out.println(student3); //$0, $0 spent, 0 bought
    
        student3.addMoney(20);
        System.out.println(student3); //$20, $0 spent, 0 bought
        student3.mealPrice(15);
        System.out.println(student3); //$5, $15 spent, 1 bought
    
        
    }
}