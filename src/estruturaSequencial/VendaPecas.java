package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class VendaPecas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        int codPeca1, codPeca2, qtdePeca1, qtdePeca2;
        double valorPeca1, valorPeca2, valorTotal; 

        codPeca1 = sc.nextInt();
        qtdePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        qtdePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotal = (qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2); 

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);

        sc.close();

    }
}
