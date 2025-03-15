package application;

import entities.Carro;
import entities.Moto;

public class Autodromo {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Corolla", 2021, 140);
        Moto moto1 = new Moto(400, 2020, "z400");
        System.out.println(moto1);
        System.out.println(carro1);
    }
}
