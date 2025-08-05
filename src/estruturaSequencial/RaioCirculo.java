package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class RaioCirculo {
    public static void main(String[] args) {
              
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, raio, PI = 3.14159;

        raio = sc.nextDouble();

        area = PI * (Math.pow(raio, 2));

        System.out.printf("A= %.4f%n", area); 

        sc.close();
        
    }
}
