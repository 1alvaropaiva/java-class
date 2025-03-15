package inheritance.socialmedia;

public abstract class ServicoMensagem {

    public void enviarMensagem(){
        System.out.println("Mensagem enviada");
    }
    public void receberMensgem(){
        System.out.println("Mensagem recebida");
    }
    public void validarConexaoInternet(){
        System.out.println("Realizando validação...");
    }
    public void salvarHistoricoMensagem(){
        System.out.println("Historico validado");
    }

}
