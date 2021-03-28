import java.util.*;

public class cenario1 {

    /**
         * Para executar o programa, entre no diretório em que o cenario1.java está e exercute os comandos:
         * javac cenario1.java
         * java -Xss1G cenario1
         */

    public static void main(String[] args) throws Exception {

        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;
        int teste = 0;
        float tempTotalIterativo = 0;
        float tempTotalRecusivo = 0;

        for(int i = 0; i < tamanho.length;i++){
            vetor = new long [tamanho[i]];


            /**
             * Esse while correspodente a parte Iterativo
             */
            teste = 0;
            while(teste< 50){
                long tempoInicial = System.currentTimeMillis();
                long tempoFinal = 0;

                numRandom(vetor);
                menorNumIterativo(vetor);

                tempoFinal = System.currentTimeMillis();
                tempTotalIterativo += (int) (tempoFinal- tempoInicial);
                teste++;
            }

            // Impressão do tempo total gasto e a média do iterativo
            System.out.println("=====================================================================================");
            System.out.println("-------------O tempo total gasto para executar 50x o iterativo foi de:-------------");
            System.out.println("TAMANHO: "+ vetor.length );
            System.out.println(tempTotalIterativo+" milissegundos");

            System.out.println("-------------A média de tempo gasto foi de:-------------");
            media(tempTotalIterativo);
            System.out.println("=====================================================================================");

            /**
             * Esse while correspodente a parte recursiva
             */
            teste = 0;
            while(teste < 50){
                long tempoInicialRec = System.currentTimeMillis();
                long tempoFinalRec = 0;

                long aux = vetor[0];
                int index = 1;
                numRandom(vetor);
                menorNumRecursivo(vetor, aux, index);

                tempoFinalRec = System.currentTimeMillis();
                tempTotalRecusivo += (int) (tempoFinalRec - tempoInicialRec);
                
                teste++;
            }


            // Impressão do tempo total gasto e a média do Recursivo
            System.out.println("=====================================================================================");
            System.out.println("-------------O tempo total gasto para executar 50x o Recursivo foi de:-------------");
            System.out.println("TAMANHO: "+ vetor.length );
            System.out.println(tempTotalRecusivo+" segundos");

            System.out.println("-------------A média de tempo gasto foi de:-------------");
            media(tempTotalRecusivo);
            System.out.println("=====================================================================================");
        }
    }

    public static void numRandom(long[] vetor){
        Random random = new Random();
        // Valores aleatórios dentro do vetor
        for(int i = 0;i < vetor.length;i++){
            vetor[i] = random.nextInt(1000000);
        }
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
        long aux = vet[0];
        // Achando o menor valor dentro do vetor
        for(int i = 1;i < vet.length;i++){
            if(vet[i]< aux )
                aux = vet[i]; 
        }
    }


    /**
     * Esse método é responsável por achar o menor valor de forma recursiva
     * @param vet
     */

    public static long menorNumRecursivo(long[] vetor,long aux,int index){

        if(index == vetor.length){
            return aux;
        }
        else{
            if(vetor[index] < aux)
                aux =  vetor[index];

         return   menorNumRecursivo(vetor, aux ,index+1);
        }
        
    }


}
