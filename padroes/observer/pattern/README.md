# Pattern Observer

Este exemplo demonstra o padrão de projeto Observer.

O `CanalYouTube` funciona como Subject (observado),
enquanto os inscritos funcionam como Observers.

Quando um novo vídeo é publicado, todos os observadores
são notificados automaticamente.

Vantagens:

- Baixo acoplamento
- Fácil manutenção
- Fácil expansão
- Maior flexibilidade
- Segue o princípio Open/Closed

O padrão Observer é muito utilizado em sistemas de eventos,
notificações e arquiteturas reativas.