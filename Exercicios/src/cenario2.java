import java.util.*;

public class cenario2 {
    public static void main(String[] args) throws Exception {
        int[] tamanho = {10,5,25,1_2};
        long[] vetor;

        for(int i = 0; i < tamanho.length;i++){
            long tempoInicial = System.currentTimeMillis();
            long tempoFinal = 0;

            vetor = new long [tamanho[i]];

            Random random = new Random();
             // Valores aleatórios dentro do vetor
            for(int j = 0;j < vetor.length;j++){
                vetor[i] = random.nextInt(100);
            }

            for(int k = 0; k< vetor.length;k++){
                System.out.println(vetor[i]);
            }

        }
        

        



    }
}
