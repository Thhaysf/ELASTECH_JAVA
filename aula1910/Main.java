package aula1910;

public class Main {
  public static void main(String[] args) {
    /*
  Criem duas classes, uma chamada Main e outra chamada Brinquedos. Crie um método dentro da classe Brinquedos chamado verBrinquedo, e faça ele receber uma instância da classe Brinquedo e printar qual instância foi.

Exemplo

"O brinquedo escolhido foi: "
*/

Brinquedos brinquedos = new Brinquedos();
brinquedos.nome = "Barbie";
        brinquedos.verBrinquedos(brinquedos);


 Bebe aurora = new Bebe("Aurora", "19/10/2016");

System.out.println("o nome da criança é: " + aurora.nome);

}
}
