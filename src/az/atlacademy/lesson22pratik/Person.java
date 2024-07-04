package az.atlacademy.lesson22pratik;

import java.util.Objects;

public class Person {
    int yas;
    long boy;
    String ad;

    public Person() {
    }

    public Person(int yas, long boy, String ad) {
        this.yas = yas;
        this.boy = boy;
        this.ad = ad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return yas == person.yas && boy == person.boy && Objects.equals(ad, person.ad);
    }
    @Override
    public int hashCode() {
        return Objects.hash(yas, boy, ad);
    }
}
