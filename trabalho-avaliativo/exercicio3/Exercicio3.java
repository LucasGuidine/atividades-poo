
package exercicio.pkg3;

public class Exercicio3 {

    public static void main(String[] args) {
        Aluno A1 = new Aluno("Juca", "01/03/2020");
        Aluno A2 = new Aluno("Ana");            
        Aluno A3 = new Aluno("Maria", "10/05/2010");
        
        A1.Iprime_Dados();
        A2.Iprime_Dados();
        A3.Iprime_Dados();
        
        A1.Imprime_Quantidade_Alunos();
    }
    
}
