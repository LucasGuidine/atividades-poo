
package exercicio.pkg3;

public class Aluno {
    private String nome;
    private String data_nascimento;
    static int total_alunos=0;
    
    Aluno(String nome){
        this.nome=nome;
        this.data_nascimento="Não informado";
        this.total_alunos++;
    }
    
    Aluno(String nome, String data_nascimento){
        this.nome=nome;
        this.data_nascimento=data_nascimento;
        this.total_alunos++;
    }
    
    public void Iprime_Dados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Data de nascimento "+this.data_nascimento);
        System.out.println("");
    }
    
    public void Imprime_Quantidade_Alunos(){
        System.out.println("A quantidade total de alunos e "+this.total_alunos);
    }
}
