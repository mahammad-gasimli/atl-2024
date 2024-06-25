package az.atlacademy.interfacelesson;

public class Go implements DeveloperFactory, InterfaceIkinci{
    @Override
    public void createDeveloper() {
        System.out.println("Go Developer created");
    }
}
