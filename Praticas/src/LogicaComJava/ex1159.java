package LogicaComJava;

import java.util.Scanner;

public class ex1159 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int p = ex.nextInt();
        int sp = 0;


        while (p != 0){
            sp = 0;
            if (p % 2 == 0){
                for(int c = 0; c < 5; c++){
                    sp += p;
                    p += 2;
                }
            } else {
                p++;
                for(int c = 0; c < 5; c ++){
                    sp += p;
                    p += 2;
                }
            }
            System.out.println(sp);
            p = ex.nextInt();
        }

        ex.close();
    }
}
