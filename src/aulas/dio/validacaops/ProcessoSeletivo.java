package aulas.dio.validacaops;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(2000.0);
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioPretendido<salarioBase){
            System.out.println("Ligar para o candidato");
        } else if (salarioPretendido==salarioBase){
            System.out.println("Ligar para o candidato fazendo contra proposta");
        } else {
            System.out.println("Aguardando o resultado de outros candidatos");
        }
    }
}
