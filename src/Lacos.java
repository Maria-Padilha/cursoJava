import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        System.out.println("Laços de repetição");
        System.out.println(" - Laço For");

        System.out.println("");
        System.out.println("TABUADA");

        Scanner scan = new Scanner(System.in);
        System.out.printf("Escreva até qual valor você quer: ");
        int qtdTabuada = scan.nextInt();

        System.out.printf("Agora escreva qual tabuada você quer: ");
        int qualTabuada = scan.nextInt();

        for(int tabuada = 1; tabuada <= qtdTabuada; tabuada++){
            int mult = tabuada * qualTabuada;
            System.out.println(qualTabuada + " x " + tabuada + " = " +mult);
        }
    }
}