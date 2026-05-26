# Antipattern - Estrutura Acoplada

Este exemplo demonstra uma implementação sem o padrão Composite.

A classe `Pasta` precisa manter listas separadas para arquivos
e subpastas, aumentando o acoplamento e dificultando expansão.

Problemas encontrados:

- Necessidade de múltiplas listas
- Alto acoplamento
- Dificuldade de manutenção
- Código menos flexível
- Violação do princípio Open/Closed

O objetivo é mostrar como estruturas hierárquicas podem ficar
complexas sem o uso do padrão Composite.    