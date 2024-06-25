package az.atlacademy.interfacelesson;

public interface DeveloperFactory {
   default void salam(){
       System.out.println("salam men Developer Factory");
   }
    void createDeveloper();
}
