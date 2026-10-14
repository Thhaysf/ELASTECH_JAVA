package Aula0710;

public class Sms implements Notificacao{

  @Override 
  public void enviar(String mensagem) {
    System.err.println("SMS enviado: Sua compra foi aprovada!");
  }
}
