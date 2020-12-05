
package exercicio.pkg1;

public class SerieLimitada {
    private String nome;
    private int ano;
    public static final int MAXIMO_INSTANCIAS = 5;
    static int total_instancias = 0;

    public SerieLimitada(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
        total_instancias++;
    }
    
    public void verificaTamanho(){
        if(total_instancias <= MAXIMO_INSTANCIAS){
            System.out.println("Nome da serie: "+this.nome);
            System.out.println("Ano: "+this.ano);
            System.out.println("");
        }
        else{
            System.out.println("Atingiu o numero maximo.");
        }
    }
}
