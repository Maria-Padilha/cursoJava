package POO;

// classe abstrata - modelo base

public class Carro {
    int ano;
    String cor;

    void ligar(){
        System.out.println("engine on .....");
    }

    void desligar(){
        System.out.println("engine off .....");
    }

    void acelerar(){
        System.out.println("vruummmm .....");
    }
}