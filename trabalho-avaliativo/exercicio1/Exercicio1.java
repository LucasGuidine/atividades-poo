
package exercicio.pkg1;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
       SerieLimitada serie[] = new SerieLimitada[4/**Colocar a quantidade de séries aqui*/];
        String nome;
        int ano;
        
        Scanner ler = new Scanner(System.in);
        
        for(int i = 0; i<3/**Colocar a quantidade de séries aqui*/; i++){
            System.out.println("Digite o nome da serie.");
            nome = ler.next();
            System.out.println("Digite o ano da serie.");
            ano = ler.nextInt();
            serie[i] = new SerieLimitada(nome, ano);
        }
         for(int i = 0; i<3/**Colocar a quantidade de séries aqui*/; i++){
            serie[i].verificaTamanho();
        }
    }
    
}
