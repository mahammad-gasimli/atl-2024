package az.atlacademy.opp;

public class MainOpp {
    public static void main(String[] args) {
        Student telebe = new Student();
        Teacher muelim = new Teacher();
        Student telebe2 = new Student();
        
        telebe.canta.setWeight(10);
        System.out.println(telebe.canta.getWeight());
    }
}
