package entities;

import inheritance.Veiculos;

public class Carro extends Veiculos {
    public int horsep;

    //construtores
    public Carro(String modelo, int ano, int horsep) {
        this.modelo = modelo;
        this.ano = ano;
        this.horsep = horsep;
    }
    //getter e setter
    public int getHorsep() {
        return horsep;
    }
    public void setHorsep(int horsep) {
        this.horsep = horsep;
    }
    //funcao toString
    public String toString(){
        return "Modelo: "
                + getModelo()
                + "\nAno: " + getAno()
                + "\nCavalos: "
                + getHorsep();
    }
}


