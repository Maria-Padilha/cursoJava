package Fundamentos;
import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        System.out.println("LAÇOS DE REPETIÇÃO");
        System.out.println("");
        System.out.println("-Laço FOR");

        Scanner scan = new Scanner(System.in);
        System.out.printf("Escreva até qual valor você quer: ");
        int qtdTabuada = scan.nextInt();

        System.out.printf("Agora escreva qual tabuada você quer: ");
        int qualTabuada = scan.nextInt();

        for(int tabuada = 1; tabuada <= qtdTabuada; tabuada++){
            int mult = tabuada * qualTabuada;
            System.out.println(qualTabuada + " x " + tabuada + " = " +mult);
        }

        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("-Laço WHILE");

        int contador = 1;
        while (contador <= 3) {
            System.out.println(contador);
            contador++;
        }

        System.out.println("______________________________________");
        System.out.println("");
        System.out.println("-Laço DO WHILE");

        char novoJogo;
        do{
            System.out.printf("deseja jogar novamente? (s/n) ");
            novoJogo = 'n';
            
        }while(novoJogo == 's');
        System.out.println("n - GAME OVER");

    }
}