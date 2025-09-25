package estuturaCondicional;

import java.util.Scanner;

public class IntervaloEntreValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        if ((valor < 0.0) || (valor > 100.00)){
            System.out.println("Fora de intervalo.");
        }
        else if (valor <= 25.0){
            System.out.println("Intervalo [0, 25]");
        }
        else if (valor <= 50.0){
            System.out.println("Intrervalo [25, 50]");
        }
        else if (valor <= 75.0){
            System.out.println("Intervalo [50, 75]");
        } 
        else {
            System.out.println("Intervalo [75, 100]");
        }

        sc.close();
    }
}
