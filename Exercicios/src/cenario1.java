import java.util.*;

public class cenario1 {

    public static void main(String[] args) throws Exception {
        int[] tamanho = {10_000,50_000,250_000,1_250_000};
        long[] vetor;
        int cont = 0;
        float tempTotalIterativo = 0;

        // Teste vetor iterativo 50 vezes
        while(cont < 50){
            long tempoInicialTotal = System.currentTimeMillis();
            long tempoFinalTotal = 0;

            System.out.println("Lista de teste: "+ cont);
            for(int i = 0; i < tamanho.length;i++){
                long tempoInicial = System.currentTimeMillis();
                long tempoFinal = 0;

                vetor = new long [tamanho[i]];
                menorNumIterativo(vetor);

                tempoFinal = System.currentTimeMillis();
                System.out.print("O tempo dentro do array é:");
                System.out.println(tempoFinal - tempoInicial + " segundos");
                System.out.println("=======================================================");
            }
            cont++;
            tempoFinalTotal = System.currentTimeMillis();

            tempTotalIterativo += (int) (tempoFinalTotal- tempoInicialTotal);
            
        }

        System.out.println("-------------O tempo total gasto para executar 50x o iterativo foi de:-------------");
        System.out.println(tempTotalIterativo+" segundos");

        System.out.println("-------------A média de tempo gasto foi de:-------------");
        media(tempTotalIterativo);
    }

    // Fazendo a média aritmética para saber a média de tempo
    public static void media(float tempTotalIterativo ){
        float media;
        media = tempTotalIterativo / 50 * 4;
        System.out.println(media+ " segundos");
    }


    // Cenário iterativo
    public static void menorNumIterativo(long[] vet) {
        int tamanhoVet = 0;

        Random random = new Random();

        // Valores aleatórios dentro do vetor
        for(int i = 0;i < vet.length;i++){
            vet[i] = random.nextInt(1000000);
            tamanhoVet = vet.length;
        }

        long aux = vet[0];
        // Achando o menor valor dentro do vetor
        for(int i = 1;i < vet.length;i++){
            
            if(vet[i]< aux )
                aux = vet[i];
                
        }

        System.out.println("TAMANHO DO VETOR: "+tamanhoVet);
        System.out.println("O menor valor é: " + aux );
    }


    // Cenário recursivo


}
