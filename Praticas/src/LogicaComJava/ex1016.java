package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;


public class ex1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        int km, h;

        km = ex.nextInt();

        h = km * 2;

        System.out.println(h + " minutos");

        ex.close();
    }
}
