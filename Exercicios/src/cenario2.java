import java.util.*;
public class cenario2 {
    public static void main(String[] args) throws Exception {
        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;
        int teste = 0;
        float tempVetOrdem = 0;
        float tempVetNaoOrdem = 0;

        for(int i = 0; i < tamanho.length;i++){
            vetor = new long [tamanho[i]];

            teste = 0;
            while(teste< 50){
                long tempoInicial = System.currentTimeMillis();
                long tempoFinal = 0;

                numRandom(vetor);
                Arrays.sort(vetor);

                int inexistente = 100_001; // Usado para achar o valor inexitente
                long numInicio = vetor[0]; // Usado para achar o valor nos primeiros 10%
                long numFinal = vetor[(vetor.length-1)-1]; // Usado para achar o valor nos ultimos 10%
                repeticaoVetOrdem(vetor,numInicio,numFinal,inexistente);

                tempoFinal = System.currentTimeMillis();
                tempVetOrdem += (int) (tempoFinal- tempoInicial);
                teste++;
            }

            // Impressão do tempo total gasto e a média do iterativo
            System.out.println("=====================================================================================");
            System.out.println("-------------O tempo total gasto para executar 50x o vetor Ordenador foi:-------------");
            System.out.println("TAMANHO: "+ vetor.length );
            System.out.println(tempVetOrdem+" millissegundos");
    
            System.out.println("-------------A média de tempo gasto foi de:-------------");
            media(tempVetOrdem);
            System.out.println("=====================================================================================");

            teste = 0;
            while(teste < 50){
                long tempoInicial = System.currentTimeMillis();
                long tempoFinal = 0;

                numRandom(vetor);

                int inexistente = 100_001; // Usado para achar o valor inexitente
                long numInicio = vetor[0]; // Usado para achar o valor nos primeiros 10%
                long numFinal = vetor[(vetor.length-1)-1]; // Usado para achar o valor nos ultimos 10%
                repeticaoNaoOrdem(vetor, numInicio, numFinal, inexistente);

                tempoFinal = System.currentTimeMillis();
                tempVetNaoOrdem += (int) (tempoFinal- tempoInicial);
                
                teste++;
            }


            System.out.println("=====================================================================================");
            System.out.println("-------------O tempo total gasto para executar 50x o vetor não ordenado:-------------");
            System.out.println("TAMANHO: "+ vetor.length );
            System.out.println(tempVetNaoOrdem+" milissegundos");
 
            System.out.println("-------------A média de tempo gasto foi de:-------------");
            media(tempVetNaoOrdem);
            System.out.println("=====================================================================================");
        }
 
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
    public static void repeticaoVetOrdem(long[] vetor,long numInicio, long numFinal, int inexistente){
        int contador = 0; // Usado para guardar quantas vezes o valor foi achado

        // Com os primeiros 10%
        for(int i = 0;i < vetor.length;i++){
            if( numInicio == vetor[i] ){
                contador++;
                if(vetor[i+1] != numInicio ){
                    break;
                }
            }
        }

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

        // Com valor inexistente
        contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if( inexistente == vetor[i] ){
                contador++;
                if(vetor[i+1] != numInicio ){
                    break;
                }
            }
        }
    }

    // Usado para calcular repetição de um vetor não ordenado
    public static void repeticaoNaoOrdem(long[] vetor,long numInicio, long numFinal, int inexistente){
        int contador = 0; // Usado para guardar quantas vezes o valor foi achado
        
        // Com os primeiros 10%
        for(int i = 0;i < vetor.length;i++){
            if( numInicio == vetor[i] ){
                contador++;
            }
        }

        // Com os ultimos 10%
        contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if( numFinal == vetor[i] ){
                contador++;
            }
        }

        // Com valor inexistente
        contador = 0;
        for(int i = 0;i < vetor.length;i++){
            if( inexistente == vetor[i] ){
                contador++;
            }
        }
    }

    // Fazendo a média aritmética para saber a média de tempo
    public static void media(float tempTotalIterativo ){
        float media;
        media = tempTotalIterativo / 50 * 4;
        System.out.println(media+ " milissegundos");
    }

}
