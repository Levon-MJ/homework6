package homework;

public class Bolola {
    public static void main(String[] args) {

        //1)

        char bolola[] = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        for (char a : bolola) {
            if (a == c) {
                System.out.println(a);
            }
        }

        //2)

        char bolola[] = {'b', 'o', 'l', 'o', 'l', 'a'};

        for (int i = 0; i < bolola.length; i++) {
        }
        System.out.println(bolola[2]);
        System.out.println(bolola[3]);

        //3)

        char bolola[] = {'b', 'o', 'l', 'o', 'l', 'a'};
        char ly = 'y';
        char length = bolola[bolola.length - 1];
        if (length == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);


        }
    }
}