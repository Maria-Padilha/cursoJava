package POO;

import java.util.Random;

// classe abstrata - modelo base

public class Carro {
    int ano;
    String cor;

    public Carro(){
        // método construtor
        // todas as classes que herdam a classe carro irão automaticamente
        // possuir o construtor carro
        Random gerador = new Random();
        int id = gerador.nextInt(100);
        System.out.println("id: "+id);
    }

    public Carro(int ano, String cor){
        this.ano = ano;
        this.cor = cor;
        
    }

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