package Aula10.AtvHashMap;

import java.lang.reflect.AnnotatedArrayType;
import java.util.HashMap;

public class AtvHashMapQ03 {
  public static void main(String[] args) {
    /*
    3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
   dentro de um if para mostrar o telefone de alguém que está na agenda
   e de alguém que não está. */

   HashMap<String, String> agenda = new HashMap<>();
  agenda.put("Ana", "9999-9999");
  agenda.put("Gabriel", "8888-8888");

  if (agenda.containsKey("Ana")) {
    System.out.println(agenda.get("Ana"));
    
  }
  else {
            System.out.println("não está na agenda");
        }

        if (agenda.containsKey("Neta")) {
            System.out.println(agenda.get("Neta"));
        } else {
            System.out.println("não está na agenda");
        }
  }
}
