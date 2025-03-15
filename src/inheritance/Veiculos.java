package inheritance;

public class Veiculos {
    public int ano;
    public String modelo;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void ligar(){
        System.out.println("Veiculo ligado");
    }
    public void desligar(){
        System.out.println("Veiculo desligado");
    }
    public void conferirCombustivel(){

    }
    public void conferirCambio(){

    }
}
