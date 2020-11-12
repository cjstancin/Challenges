public class Employee {
    private String name;
    private String Position;
    private double wage;
    private int id;
    private double hoursWorked;
    private double totalHours;

    public Employee(String name, String position, double wage, int id) {
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.id = id;
    }

    public String getName() {return name;}
    public String getPosition() {return Position;}
    public double getWage() {return wage;}
    public double getid() {return id;}
    public double gethourWorked() {return hoursWorked;}
    public double gettotalHours() {return totalHours;}

    public void setName(int name) {this.name = name;}
    public void setPosition(int positino) {this.position = position;}
    public void setWage(int wage) {this.wage = wage;}


    public void hours(double hours) {
        hoursWorked += hours;
        totalHours += hours;
    }


    public String toString() {
        return "Employee name: " + name + "\nPosition: " + position + "\nWage: " + wage + "\nID: " + id + "\nHours Worked: " + hoursWorked + "/nTotal Hours: " + totalHours;
    }
}