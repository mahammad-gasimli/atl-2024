package az.atlacademy.opp;

public class Student extends Person{
        private int grade;
        public Bag canta ;

        public int getGrade() {
                return grade;
        }

        public void setGrade(int grade) {
                this.grade = grade;
        }

        public Bag getCanta() {
                return canta;
        }

        public void setCanta(Bag canta) {
                this.canta = canta;
        }
}
