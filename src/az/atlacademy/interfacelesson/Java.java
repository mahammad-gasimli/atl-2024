package az.atlacademy.interfacelesson;

public class Java extends Go implements DeveloperFactory{
    private int number;

    @Override
    public void createDeveloper() {
        System.out.println("Java Developer created");


    }
}
