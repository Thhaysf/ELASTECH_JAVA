package polimorfismoheranca;


public class AtvHeranca2 {
  public static void main(String[] args) {
    
    Diretora carla = new Diretora();
  carla.nome = "Carla";
  
  carla.baterPonto();                 
  carla.aprovarFerias("João da Silva"); 
  carla.definirMeta("Aumentar faturamento em 20%"); 
 

  Gerente gerente = new Gerente();
 gerente.nome = "Rodrigo";

        gerente.baterPonto();                     
        gerente.aprovarFerias("Alice Oliveira."); 
        gerente.notificar(", verificar e-mails.");  
        gerente.exportar();           

 }
}
