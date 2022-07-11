package LogicaComJava;

import java.util.Locale;

public class ExercicioDeFixacao {

    public static void main(String[] args) {

        String produto1 = "Computer";
        String produto2 = "Office desk";

        int idade = 30;
        int code = 5290;
        char gender = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("%s, whice price is $ %.2f %n", produto1, preco1);
        System.out.printf("%s, whice price is $ %.2f %n", produto2, preco2);

        System.out.printf("Record: %d years old, code %d and gender : %s %n", idade, code, gender);

        System.out.println("Measue with eight decimal places: " + measure);
        System.out.printf("Rouded (Three decimal Places) : %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }
}
