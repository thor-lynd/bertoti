# Padrão de Projeto Strategy

## Objetivo

O padrão **Strategy** é um padrão comportamental que permite definir diferentes algoritmos ou comportamentos em classes separadas e trocá-los em tempo de execução.

Neste projeto, o padrão foi utilizado para representar diferentes formas de concessão de empréstimos para clientes.

## Problema

Sem o uso de Strategy, a classe `Cliente` precisaria utilizar diversos `if/else` para decidir qual tipo de empréstimo aplicar.

Exemplo:

```java
if(tipo.equals("PREMIUM")) {
    ...
} else if(tipo.equals("COMUM")) {
    ...
}