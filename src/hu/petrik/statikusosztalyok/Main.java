package hu.petrik.statikusosztalyok;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            System.out.println(Veletlen.velEgesz(5,10));
        }
        System.out.println();
        for (int i = 0; i < 50; i++) {
            System.out.println(Veletlen.velKarakter((char) 65, (char) 90));
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(true));
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println(Veletlen.velTeljesNev(false));
        }
    }
}
