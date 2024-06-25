package az.atlacademy.happyfamily;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Pet("Sfinks", "Mestan", 4, 80);
        Pet cat2 = new Pet("Angorka", "Kedi", 1, 10);

        Human father = new Human("Father", "Father", 44, 134, cat2);
        Human mother = new Human("Fatma", "Quluyeva", 43, 134, cat );
        Pet dog = new Pet();
        Human child =new Human("", "s", 129, 12, cat2, father,mother);
        System.out.println(child.getMother().getMother());
        String ad = null;
        ad.replace("a", "b");
    }
}
