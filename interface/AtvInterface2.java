package aula0710;

import java.util.ArrayList;

public class AtvInterface2 {
public static void main(String[] args) {
  
  ArrayList<Notificacao> notifcacao = new ArrayList<>();
  notifcacao.add(new Sms());
  notifcacao.add(new Email());

  for (Notificacao notificacao : notifcacao) {
    notificacao.enviar("Nova notificação");
  }

}
}
