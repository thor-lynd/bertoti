# Pattern Composite

Este exemplo demonstra o padrão de projeto Composite.

O objetivo do Composite é permitir que objetos individuais
e grupos de objetos sejam tratados da mesma forma.

Neste exemplo:

- `Arquivo` representa um objeto simples (Leaf)
- `Pasta` representa um objeto composto (Composite)

Ambos implementam a interface `Componente`,
permitindo manipulação uniforme.

Vantagens:

- Baixo acoplamento
- Estruturas hierárquicas mais simples
- Fácil expansão
- Código mais flexível
- Redução de verificações de tipo

O padrão Composite é muito utilizado em árvores de diretórios,
interfaces gráficas e estruturas organizacionais.