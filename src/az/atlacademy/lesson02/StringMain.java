package az.atlacademy.lesson02;

public class StringMain {

    public static void main(String[] args) {

//        String a = "alma";
//        String b = "alma";
//        String c = new String("alma");
//        String d = new String("alma");
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        System.out.println(c.hashCode());
//        System.out.println(d.hashCode());
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a == d);
//        System.out.println(d == c);

        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
            System.out.println(alpha);
        }


    }

}
