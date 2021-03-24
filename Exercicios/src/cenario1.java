import java.util.*;

public class cenario1 {

    public static void main(String[] args) throws Exception {

        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;
        int teste = 0;
        float tempTotalIterativo = 0;
        float tempTotalRecusivo = 0;

        while(teste < 50){
            
            for(int i = 0; i < tamanho.length;i++){
                System.out.println("esse é interativo");
                float tempoInicial = System.currentTimeMillis();
                float tempoFinal = 0;

                vetor = new long [tamanho[i]];
                menorNumIterativo(vetor);

                tempoFinal = System.currentTimeMillis();
                tempTotalIterativo += (int) (tempoFinal- tempoInicial);
                System.out.print("O tempo dentro do array é:");
                System.out.println(tempoFinal - tempoInicial + " milissegundos");
                System.out.println("=======================================================");
            }  

            // Teste vetor iterativo 50 vezes
            for(int i = 0; i < tamanho.length;i++){
                long tempoInicialRec = System.currentTimeMillis();
                long tempoFinalRec = 0;

                vetor = new long [tamanho[i]];

                long aux = vetor[0];
                int var = 1;
        
                menorNumRecursivo(vetor, aux, var);

                tempoFinalRec = System.currentTimeMillis();
                tempTotalRecusivo += (int) (tempoFinalRec - tempoInicialRec);
                System.out.print("O tempo dentro do array é:");
                System.out.println(tempoFinalRec - tempoInicialRec + " milissegundos");
                System.out.println("=======================================================");
            }

            // Atualiza o wilhe
            teste++;
        }


        // Impressão do tempo total gasto e a média do iterativo
        System.out.println("=====================================================================================");
        System.out.println("-------------O tempo total gasto para executar 50x o iterativo foi de:-------------");
        System.out.println(tempTotalIterativo+" milissegundos");

        System.out.println("-------------A média de tempo gasto foi de:-------------");
        media(tempTotalIterativo);
        System.out.println("=====================================================================================");


        // Impressão do tempo total gasto e a média do Recursivo
        System.out.println("=====================================================================================");
        System.out.println("-------------O tempo total gasto para executar 50x o Recursivo foi de:-------------");
        System.out.println(tempTotalRecusivo+" segundos");

        System.out.println("-------------A média de tempo gasto foi de:-------------");
        media(tempTotalRecusivo);
        System.out.println("=====================================================================================");

    }

    
    // Fazendo a média aritmética para saber a média de tempo
    public static void media(float tempTotalIterativo ){
        float media;
        media = tempTotalIterativo / 50 * 4;
        System.out.println(media+ " milissegundos");
    }


    /**
     * Esse método é responsável por preencher o vetor com números randômicos
     * e achar o menor numero dentro desse vetor.
     * @param vet
     */
    public static void menorNumIterativo(long[] vet) {

        Random random = new Random();

        // Valores aleatórios dentro do vetor
        for(int i = 0;i < vet.length;i++){
            vet[i] = random.nextInt(1000);
        }

        long aux = vet[0];
        // Achando o menor valor dentro do vetor
        for(int i = 1;i < vet.length;i++){
            
            if(vet[i]< aux )
                aux = vet[i];
                
        }
        System.out.println("O menor valor é: " + aux );
    }


    /**
     * Esse método é responsável por achar o menor valor de forma recursiva
     * @param vet
     */

    public static void menorNumRecursivo(long[] vetor,long aux,int var){

        if(var == vetor.length)
            System.out.println("O menor valor é :"+ aux);
        
        else if(vetor[var] < aux){
            aux =  vetor[var];
            menorNumRecursivo(vetor, aux ,var+1);
        }
        else if(var < vetor.length)
            menorNumRecursivo(vetor, aux ,var+1);
    }


}
