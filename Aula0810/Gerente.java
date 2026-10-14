package aula0810;

public class Gerente extends Funcionario implements Notificavel, Exportavel {
      
    public void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou as férias de: " + quem);
  }

  @Override
    public void notificar(String mensagem) {
        System.out.println("Notificando: " + nome + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando informações para reunião do Gerente " + nome + ", por gentileza, aguardar..");
}
}
