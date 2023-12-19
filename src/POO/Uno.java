package POO;

public class Uno {
    public static void main(String[] args) {
        Carro uno = new Carro(1991, "Branco");

        System.out.println("carro: uno");
        System.out.println("ano: "+ uno.ano);
        System.out.println("cor: "+ uno.cor);

        uno.ligar();
    }
}