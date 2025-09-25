package estuturaCondicional;
import java.util.Scanner;

public class CompraProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigoProduto, quantidade;
        double total = 0;

        codigoProduto = sc.nextInt();
        quantidade = sc.nextInt();

        if (codigoProduto == 1){
            total = quantidade * 4.0;
        } 
        else if (codigoProduto == 2){
            total = quantidade * 4.5;
        }
        else if (codigoProduto == 3){
            total = quantidade * 5.0;
        }
        else if (codigoProduto == 4){
            total = quantidade * 2.0;
        }
        else if (codigoProduto == 5){
            total = quantidade * 1.5;
        }
        else {
            System.out.println("Digite um código válido entre: (1 - 6)");
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
