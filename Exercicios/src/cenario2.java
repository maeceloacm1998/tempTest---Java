import java.util.*;

public class cenario2 {
    public static void main(String[] args) throws Exception {
        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;

        
            vetor = new long [5];
            numRandom(vetor);
            ordemVetor(vetor);
            repeticaoVetOdem(vetor);

    }

    // Usado para incluir números random dentro de um vetor
    public static void numRandom(long[] vetor){
         // Valores aleatórios dentro do vetor
         Random random = new Random();
         // Valores aleatórios dentro do vetor
         for(int i = 0;i < vetor.length;i++){
             vetor[i] = random.nextInt(100_000);
         }
    }

    // Usado para imprimir um vetor;
    public static void imprimir(long[] vetor){
        for(int i = 0;i < vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }

    // Usado para ordenar um vetor
    public static void ordemVetor(long[] vetor){

        for(int i = 0;i < vetor.length;i++){
            for(int j = 0; j < i;j++){
                if(vetor[i] < vetor[j]){
                    long aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }

    // Usado para calcular repetição de um vetor ordenado
    public static void repeticaoVetOdem(long[] vetor){
        // Valores a pegar
        int contador = 0; // Usado para guardar quantas vezes o valor foi achado
        long inexistente = 100_001; // Usado para achar o valor inexitente
        System.out.println("=======================================================================");
        System.out.println("O valor é:"+inexistente);
        long numInicio = vetor[0]; // Usado para achar o valor nos primeiros 10%
        System.out.println("O valor inicio é:"+numInicio);
        long numFinal = vetor[(vetor.length-1)-1]; // Usado para achar o valor nos ultimos 10%
        System.out.println("O valor final é:"+numFinal);

        // Com os primeiros 10%
        for(int i = 0;i < vetor.length;i++){
            if( numInicio == vetor[i] ){
                contador++;
                if(vetor[i+1] != numInicio){
                    break;
                }
            }
        }
        System.out.println("Com o valor obitido nos primeiros 10%, o valor " +numInicio+ " foi encontrado "+ contador+" vezes");

        // Com os ultimos 10%
        contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if( numFinal == vetor[i] ){
                contador++;
                if(vetor[i+1] != numInicio ){
                    break;
                }
            }
        }
        System.out.println("Com o valor obitido nos ultimos 10%, o valor " +numFinal+ " foi encontrado "+ contador+" vezes");

        // Com valor inexistente
        contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if( inexistente == vetor[i] ){
                contador++;
                if(vetor[i+1] != numInicio){
                    break;
                }
            }
        }
        System.out.println("Nos Primeiros 10%, o valor " +inexistente+ " foi encontrado "+ contador+" vezes");
        System.out.println("=======================================================================");
    }
}
