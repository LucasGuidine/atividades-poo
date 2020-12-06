
package exercicio.pkg1;

public class Funcionario {
    String cpf;
    int ano;
    int mes;
    String nivel;
    float salario;
    
    Funcionario(String cpf, String nivel){
        this.cpf = cpf;
        this.nivel = nivel;
    }
    
    Funcionario(String cpf, int mes, int ano){
        this.mes = mes;
        this.ano = ano;
    }
    
    public void mostra_o_nivel_de_carreira(){
        System.out.println("O nivel do funcionario e: " + this.nivel);
    }
    
    public void mostra_o_nivel_de_carreira(int mes, int ano){
        int anoatual = 2020;
        int mesatual = 12;
        String nivel;
        int anosdeempresa;
        
        anosdeempresa=anoatual-ano;
        
        if(mesatual<mes){
            anosdeempresa--;
        }
        
        if(anosdeempresa>30){
            nivel="abc";
        }else if(anosdeempresa>15){
            nivel="def";
        }else if(anosdeempresa>5){
            nivel="ghi";
        }else{
            nivel="Não possui nivel";
        }
        
        this.nivel=nivel;
        System.out.println("O nivel do funcionario e: " + this.nivel);
    }
    
    public void participacao_nos_lucros(String nivel){
        if(nivel=="abc"){
            System.out.println("Recebe cinco vezes o salário bruto");
        }else if(nivel=="def"){
            System.out.println("Recebe três vezes o salário bruto");
        }else if(nivel=="ghi"){
            System.out.println("Recebe duas vezes o salário bruto");
        }else{
            System.out.println("Não recebe nada de participacao");
        }
    }
    
    public void participacao_nos_lucros(int mes, int ano){
        this.participacao_nos_lucros(this.nivel);
    }
}
