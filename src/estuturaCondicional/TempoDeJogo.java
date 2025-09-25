package estuturaCondicional;
import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int inicioJogo, fimJogo;
    
        inicioJogo = sc.nextInt();
        fimJogo = sc.nextInt();

        int duracaoJogo; 

        if(inicioJogo < fimJogo){
            duracaoJogo = fimJogo - inicioJogo; 
        } 
        else {
            duracaoJogo = 24 - inicioJogo + fimJogo;
        }

        System.out.println("O jogo durou " + duracaoJogo + " horas.");

        sc.close();
    }
    
    

}
