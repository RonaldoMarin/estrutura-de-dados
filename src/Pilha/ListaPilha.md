## Descreva o estado da pilha (inicialmente vazia) após cada uma das operações a seguir

| Interaction | Command | Stack        |   
|-------------|---------|--------------|
| 0           | -       | [ ]          |
| 1           | push(5) | [5]          |   
| 2           | push(3) | [5,3]        |   
| 3           | pop()   | [5]          |
| 4           | push(2) | [5, 2]       |
| 5           | push(8) | [5, 2, 8]    |
| 6           | pop()   | [5, 2]       |
| 7           | pop()   | [5]          |
| 8           | push(9) | [5, 9]       |
| 9           | push(1) | [5, 9, 1]    |
| 10          | pop()   | [5, 9]       |
| 11          | push(7) | [5, 9, 7]    |
| 12          | push(6) | [5, 9, 7, 6] |
| 13          | pop()   | [5, 9, 7]    |
| 14          | pop()   | [5, 9]       |
| 15          | push(4) | [5, 9, 4]    |
| 16          | pop()   | [5, 9]       |
| 17          | pop()   | [5]          |


## Utilizando os arquivos PilhaArray.java, Pilha.java, TestePilha.java, preencha a tabela abaixo, onde a linha superior diz o método de aumento da capacidade e a coluna da esquerda informa a quantidade de elementos colocados na pilha. Em cada célula da tabela deverá ser colocado o tempo, em milisegundos (use System.currentTimeMillis()), de se colocar os elementos. Utilize as duas estratégias de crescimento (constante e duplicação) para oray.

10 Elementos - 10 Incremento: 0ms
10 Elementos - 100 Incremento: 0ms
10 Elementos - 1000 Incremento: 1ms
10 Elementos - 10000 Incremento: 4ms
10 Elementos - Duplicação: 