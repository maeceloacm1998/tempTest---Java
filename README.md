# Testes de tempo
Realizando testes de quanto tempo minha aplicação demora para ser executada. Temos 3 Cenários, sendo eles:
## Cenário I:
- Algoritmo para identificar o menor valor em um vetor de inteiros não-ordenado (iterativo).
- Algoritmo para identificar o menor valor em um vetor de inteiros não-ordenado (recursivo).
- Valores a testar: usar vetores de tamanho 10.000, 50.000, 250.000, 1.250.000.
## Cenário II:
- Algoritmo para contar o número de repetições de um valor em vetor ordenado.
- Algoritmo para contar o número de repetições de um valor em vetor não-ordenado.
- Valores a testar: usar vetores de tamanho 10.000, 50.000, 250.000, 1.250.000. Buscar, para
cada caso, um valor nos primeiros 10% das posições, um valor nos últimos 10% das posições
e um valor inexistente.
## Cenário III:
- Algoritmo para calcular o n-ésimo número da série de Fibonacci (iterativo).
- Algoritmo para calcular o n-ésimo número da série de Fibonacci (recursivo).
- Obs.: para este cenário, utilize variáveis long em lugar de int.
Valores a testar: 10, 50, 250, 1.250. (iterativo). Para o recursivo, inicie com o número 10 e
aumente de 2 em 2 até o valor que estourar 60 segundos de execução.

# As tarefas são:
- Para cada cenário acima, executar os testes e marcar o tempo de execução.
- Executar cada teste em cada alternativa (a e b) 50 vezes. (exceção para Fibonacci
recursivo: neste caso, execute até estourar o tempo de 60 segundos, uma vez cada).
- Marcar o tempo de cada execução em nanossegundos ou milissegundos (divisão dos
nanossegundos por 1.000.000) e fazer a média de cada caso de teste.
Observação importante: para a marcação de tempo, desabilite a impressão nos
métodos. Caso contrário, seu algoritmo terá o tempo distorcido pelo tempo de
impressão em tela.
-  Apresente todos os dados acima em tabelas organizadas por cenário e por teste. Veja
um exemplo no enunciado da Lista 4.
-  Apresente um gráfico com o resultado consolidado para cada cenário.
- Para cada gráfico, escreva um parágrafo comentando sobre os resultados encontrados
e relacionando os resultados à complexidade teórica dos algoritmos que você
implementou.
- Sua entrega deve ser em formato ZIP, contendo um documento em PDF com o que foi
pedido acima e o código fonte utilizado para os testes.
