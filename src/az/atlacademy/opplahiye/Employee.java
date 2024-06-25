package az.atlacademy.opplahiye;

public class Employee {
    int no;

    String name;

    int year;

    String department;
    public static final int BASE_SALARY = 500;
    public void work(){
        System.out.println("Employe is working");
    }
    public double calculateSalary(){
        return year*BASE_SALARY;
    }

    public void printInfo(){
        System.out.println("\nNO:" + no);
        System.out.println("");
    }


    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
}
