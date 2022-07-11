package LogicaComJava;

import java.util.Scanner;

public class ex1049 {
    public static void main(String[] args) {
        Scanner ex = new Scanner(System.in);

        String tp1, tp2, tp3;

        tp1 = ex.nextLine();
        tp2 = ex.nextLine();
        tp3 = ex.nextLine();

        switch(tp1){
            case "vertebrado":
                switch (tp2){
                    case "mamifero":
                        switch(tp3){
                            case "onivoro":
                                System.out.println("homem");
                                break;
                            case "herbivoro":
                                System.out.println("vaca");
                                break;

                        }
                        break;
                    case "ave":
                        switch(tp3){
                            case "carnivoro":
                                System.out.println("aguia");
                                break;
                            case "onivoro":
                                System.out.println("pomba");
                                break;
                        }
                        break;
                }
            case "invertebrado":
                switch(tp2){
                    case "inseto":
                        switch (tp3){
                            case "hematofago":
                                System.out.println("Pulga");
                                break;
                            case "herbivoro":
                                System.out.println("lagarta");
                                break;
                        }
                        break;
                    case "anelideo":
                        switch(tp3){
                            case "hematofago":
                                System.out.println("sanguessuga");
                                break;
                            case "onivoro":
                                System.out.println("minhoca");
                                break;
                        }
                        break;
                }

        }

        ex.close();
    }
}
