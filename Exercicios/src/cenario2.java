import java.util.*;

public class cenario2 {
    public static void main(String[] args) throws Exception {
        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;

        
            vetor = new long [5];
            numRandom(vetor);
            ordemVetor(vetor);
            imprimir(vetor);


    }

    // Usado para incluir números random dentro de um vetor
    public static void numRandom(long[] vetor){
         // Valores aleatórios dentro do vetor
         Random random = new Random();
         // Valores aleatórios dentro do vetor
         for(int i = 0;i < vetor.length;i++){
             vetor[i] = random.nextInt(1000000);
         }
    }

    public static void imprimir(long[] vetor){
        for(int i = 0;i < vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }

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

    public static void repeticao(long[] vetor, int valor){
        int contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if(valor == vetor[i] ){
                contador += 1;
            }
        }
        
        if(contador != 0){
            System.out.println("O número "+valor+" foi encontrado "+ contador + " vezes.");
        }
    }
}
