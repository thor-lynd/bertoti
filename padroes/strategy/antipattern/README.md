# Antipadrão: Uso Excessivo de if/else

## Objetivo

Este exemplo demonstra um antipadrão comum em desenvolvimento de software: concentrar múltiplas regras de negócio em uma única classe utilizando estruturas condicionais (`if/else`).

## Problema

A classe `Cliente` é responsável por decidir qual tipo de empréstimo será concedido com base no tipo do cliente.

Exemplo:

```java
public void emprestar() {

    if ("PREMIUM".equals(tipoCliente)) {
        System.out.println("Empréstimo Premium aprovado!");
    }
    else if ("COMUM".equals(tipoCliente)) {
        System.out.println("Empréstimo Comum aprovado!");
    }
    else if ("UNIVERSITARIO".equals(tipoCliente)) {
        System.out.println("Empréstimo Universitário aprovado!");
    }
    else {
        System.out.println("Empréstimo negado!");
    }
}
```

## Problemas da Abordagem

- Alto acoplamento entre a classe e as regras de negócio.
- Crescimento excessivo de estruturas `if/else`.
- Dificuldade de manutenção.
- Maior chance de erros ao adicionar novas funcionalidades.
- Violação do princípio Open/Closed (aberto para extensão e fechado para modificação).

## Exemplo de Uso

```java
Cliente cliente =
    new Cliente("João", 10000.0, "PREMIUM");

cliente.emprestar();
```

### Saída

```text
Empréstimo Premium aprovado!
```

## Consequências

Sempre que um novo tipo de empréstimo for criado, será necessário modificar a classe `Cliente`:

```java
else if ("EMPRESARIAL".equals(tipoCliente)) {
    System.out.println("Empréstimo Empresarial aprovado!");
}
```

Isso torna o sistema mais difícil de escalar e manter ao longo do tempo.

## Solução Recomendada

Substituir as condicionais por um padrão de projeto como o **Strategy**, onde cada tipo de empréstimo é encapsulado em uma classe específica, reduzindo o acoplamento e facilitando a extensão do sistema.

## Conclusão

Embora funcione para casos simples, o uso excessivo de `if/else` é considerado um antipadrão quando o sistema possui múltiplas regras de negócio que tendem a crescer com o tempo.