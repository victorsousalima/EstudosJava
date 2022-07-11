package LogicaComJava;

import java.util.Scanner;
import java.util.Locale;

public class ex1045 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ex = new Scanner(System.in);

        double a, b, c, cc;

        a = ex.nextDouble();
        b = ex.nextDouble();
        c = ex.nextDouble();

        if( a > b && a > c){
            a = a;
            if (b > c){
                b = b;
                c = c;
            } else{
                b = c;
                c = b;
            }
        }
        else if(b > a && b > c){
            cc = a;
            a = b;
            if(cc > c){
                b = cc;
                c = c;
            }else{
                b = c;
                c = cc;
            }
        }
        else if(c > a && c > b){
            cc = a;
            a = c;
            if(cc > b){
                b = cc;
                c = b;
            }else{
                b = b;
                c = cc;
            }
        }

        if(a >= b + c){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else {
            if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            //Equilatero ou Isosceles
            if (a == b && b == c && a == c) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }


        ex.close();
    }
}
