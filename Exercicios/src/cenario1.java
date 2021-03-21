import java.util.*;

public class cenario1 {
    public static void main(String[] args) throws Exception {
        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;

        // Usado para rodar o vetor de cada tamanho
        for(int i = 0; i < tamanho.length;i++){
            vetor = new long [tamanho[i]];
            iterativo(vetor, tamanho);
        }

    }

    // Cenário iterativo
    public static void iterativo(long[] vet, int[] tamanho) {
        long tempoInicial = System.currentTimeMillis();
        int cont = 0;
        Random random = new Random();

        // Valores aleatórios dentro do vetor
        for(int i = 0;i < vet.length;i++){
            vet[i] = random.nextInt(1000000);
            cont = vet.length;
        }

        long aux = vet[0];
        // Achando o menor valor dentro do vetor
        for(int i = 1;i < vet.length;i++){
            
            if(vet[i]< aux )
                aux = vet[i];
                
        }

        System.out.println("TAMANHO DO VETOR: "+cont);
        System.out.print("O menor valor é: " + aux + " -- TEMPO:");
        System.out.println(System.currentTimeMillis() - tempoInicial+ " segundos");
        System.out.println("=======================================================");

    }


    // Cenário recursivo


}
