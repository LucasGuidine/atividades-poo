
package exercicio.pkg2;

public class Numeros {
    int a, b, c, d;
    
    Numeros(int a, int b){
        this.a=a;
        this.b=b;
    }
    
    Numeros(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    Numeros(int a, int b, int c, int d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    
    public void calcula_maior_numero(int a, int b){
        if(a>b){
            System.out.println("O maior numero e "+a);
        }else{
            System.out.println("O maior numero e "+b);
        }
    }
    
    public void calcula_maior_numero(int a, int b, int c){
        int vet[] = {a,b,c};
        int maior;
        maior = vet[0];
        for(int i=0; i<3; i++){
            if(vet[i]>maior){
                maior=vet[i];
            }
        }
        System.out.println("O maior numero e "+maior);
    }
    
    public void calcula_maior_numero(int a, int b, int c, int d){
        int vet[] = {a,b,c,d};
        int maior;
        maior = vet[0];
        for(int i=0; i<4; i++){
            if(vet[i]>maior){
                maior=vet[i];
            }
        }
        System.out.println("O maior numero e "+maior);
    }
}
