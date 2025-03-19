Desafio Conta Terminal - Projeto DIO Java Básico

Descrição

Este projeto é uma aplicação simples desenvolvida em Java como parte do curso da DIO para praticar o uso da classe Scanner, manipulação de entrada e saída de dados, e concatenação de strings. O programa simula a abertura de uma conta bancária, solicitando informações do usuário e exibindo uma mensagem personalizada com os dados inseridos.

Funcionalidades

Solicita o nome da agência bancária.

Solicita o número da agência.

Solicita o nome do titular da conta.

Solicita o saldo inicial da conta.

Exibe uma mensagem confirmando a abertura da conta com os dados informados.


Estruturas e conceitos aplicados

Classe Scanner:

Utilizada para capturar entradas do usuário.


Métodos nextLine(), nextInt() e nextDouble():

nextLine(): Lê textos completos (strings).

nextInt(): Lê números inteiros.

nextDouble(): Lê números decimais.


Manipulação de entrada de dados:

Uso de scanner.nextLine(); extra para consumir a quebra de linha após a entrada numérica e evitar problemas na leitura do nome do titular.


Concatenação de strings:

Construção da mensagem final usando os valores inseridos.



Como executar o projeto

1. Certifique-se de ter o Java JDK instalado.


2. Copie o código para um arquivo chamado ContaTerminal.java.


3. Compile o programa com o comando:

javac ContaTerminal.java


4. Execute o programa com:

java ContaTerminal


5. Insira os dados quando solicitado.


6. Observe a mensagem final de confirmação da conta.



Exemplo de uso

Entrada:

Digite o nome da agência: Banco Central  
Digite o número da agência: 1234  
Digite o nome do titular da conta: João Silva  
Digite o saldo inicial da conta: 1500.75

Saída:

Olá, João Silva. Você abriu uma conta no banco Banco Central com o número de agência 1234 e com saldo inicial de R$ 1500.75.

Melhorias futuras

Implementar um sistema de validação para evitar entradas inválidas.

Permitir ao usuário realizar operações como depósito e saque.

Criar um menu interativo para mais funcionalidades bancárias.

Adicionar suporte para múltiplas contas e persistência de dados.


Conclusão

Este projeto é uma excelente prática para o uso da classe Scanner e manipulação de entrada e saída no Java. Ele reforça conceitos básicos da linguagem e simula um cenário real de um sistema bancário simples.
