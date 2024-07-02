package az.atlacademy.happyfamily;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel; //a whole number from 1 to 100

    public String eat() {
        return "I am eating";
    }

    public String respond() {
        return "Hello, owner. I am - " + this.nickname + ". I miss you!";
    }
    public String foul(){
        return "I need to cover it up";
    }

    public String getSpecies() {
        return species;
    }

    public Pet() {

    }

    public Pet(String species, String nickname, int age, int trickLevel) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
    }

    public Pet(String nickname, int trickLevel) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                '}';
    }
}