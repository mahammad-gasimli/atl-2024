package az.atlacademy.opplahiye;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Jack", 14, "Production");
        System.out.println("Salary" + e.calculateSalary());

    }
}
