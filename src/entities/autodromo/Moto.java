package entities.autodromo;

import inheritance.autodromo.Veiculos;

public class Moto extends Veiculos {
    private int cilindradas;

    //construtores
    public Moto(int cilindradas, int ano, String modelo) {
        this.cilindradas = cilindradas;
        this.ano = ano;
        this.modelo = modelo;
    }
    //getter e setter
    public int getCilindradas() {
        return cilindradas;
    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    //toString function
    public String toString(){
        return "Modelo: "
                + getModelo()
                + "\nAno: " + getAno()
                + "\nCilindradas: "
                + getCilindradas();
    }
}
