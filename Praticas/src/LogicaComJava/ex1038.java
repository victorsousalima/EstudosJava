package LogicaComJava;

import java.util.Scanner;

public class ex1038 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int c, q;
        double vf;

        c = ex.nextInt();
        q = ex.nextInt();

        switch(c){
            case 1:
                vf = q * 4.00;
                System.out.printf("Total: R$ %.2f", vf);
                break;
            case 2:
                vf = q * 4.50;
                System.out.printf("Total: R$ %.2f", vf);
                break;
            case 3:
                vf = q * 5.00;
                System.out.printf("Total: R$ %.2f", vf);
                break;
            case 4:
                vf = q * 2.00;
                System.out.printf("Total: R$ %.2f", vf);
                break;
            case 5:
                vf = q * 1.50;
                System.out.printf("Total: R$ %.2f", vf);
        }



        ex.close();
    }
}
