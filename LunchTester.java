public class LunchTester {
    public static void main(String[] args) {
        LunchAccount student1 = new LunchAccount("Charles", 30.00);
        LunchAccount student2 = new LunchAccount("John");
        System.out.println(student1);
        System.out.println(student2);
    
        student1.addMoney(20);
        System.out.println(student1);    
        //student2.addMoney(20);
        //System.out.println(student2);
        
        student1.mealPrice(45);
        System.out.println(student1);    
        //student2.mealPrice(45);
        //System.out.println(student2);    
    
        student1.addMoney(20);
        System.out.println(student1);
        student1.mealPrice(15);
        System.out.println(student1);   
    }
}