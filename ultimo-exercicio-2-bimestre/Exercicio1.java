
package exercicio.pkg1;

public class Exercicio1 {

    public static void main(String[] args) {
        Funcionario n1 = new Funcionario("00000000001", "ghi");//colocar o cpf e o nível
        Funcionario n2 = new Funcionario("00000000002", 12, 2016);//colocar o cpf, o mes e o ano
        
        System.out.println("Informacoes do 1 funcionario");
        n1.mostra_o_nivel_de_carreira();
        n1.participacao_nos_lucros("ghi");//colocar o nivel
        System.out.println("");
        
        System.out.println("Informacoes do 2 funcionario");
        n2.mostra_o_nivel_de_carreira(12, 2016);//colocar o me e o ano
        n2.participacao_nos_lucros(12, 2016);//colocar o mes e o ano
        System.out.println("");
    }
    
}
