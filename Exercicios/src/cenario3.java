public class cenario3 {
  public static void main(String[] args) throws Exception {
    long[] vetor;
    int[] valores = {10,50,250,1_250};
    int teste = 0;
    float tempVetOrdem = 0;
    float tempVetNaoOrdem = 0;

    for(int i = 0; i < valores.length;i++){
      vetor = new long[valores[i]];

      while(teste < 50){
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = 0;

        fibonacciIterativo(vetor);

        tempoFinal = System.currentTimeMillis();
        tempVetOrdem += (int) (tempoFinal- tempoInicial);
        teste++;
      }

    }

  }
  public static void fibonacciIterativo(long[] vetor){
    for(int i = 0; i < vetor.length;i++){
      if(i == 0 || i == 1){
        vetor[i] = 1;
      }
      else{
        vetor[i] = vetor[i-1] + vetor[i-2];
      }
    }
    System.out.println("O valor do termo "+vetor.length+" é: "+vetor[vetor.length-1]);
  }
}
