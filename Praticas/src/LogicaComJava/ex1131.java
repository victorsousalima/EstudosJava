package LogicaComJava;

import java.util.Scanner;

public class ex1131 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        int g, i , q;
        int c = 1;
        int vi = 0;
        int vg = 0;
        int e = 0;
        int qg = 0;

        while(c != 2){
            q = c;
            while(q != 2){
                i = ex.nextInt();
                g = ex.nextInt();

                if(i > g){
                    vi++;
                }
                else if(g > i){
                    vg++;
                }
                else if(i == g){
                    e++;
                }
                q = 2;
            }
            qg++;
            System.out.println("novo grenal (1-sim 2-nao)");
            c = ex.nextInt();
        }

        System.out.println(qg + " grenais");
        System.out.println("Inter: " + vi);
        System.out.println("Gremio: " + vg);
        System.out.println("Empates: " + e);
        if (vi > vg){
            System.out.println("Inter venceu mais");
        }
        else if (vi == vg){
            System.out.println("Nao houve vencedor");
        }
        else{
            System.out.println("Gremio venceu mais");
        }


        ex.close();
    }
}
