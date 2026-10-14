package Aula0710;

public class Email implements Notificacao {

  @Override 
  public void enviar(String mensagem) {
    System.err.println("E-mail enviado: Sua compra foi aprovada!");
}
}