# Antipattern - Notificações Acopladas

Este exemplo demonstra um antipadrão onde a classe `CanalYouTube`
é responsável diretamente por todas as formas de notificação.

Problemas encontrados:

- Alto acoplamento
- Muitos códigos fixos
- Difícil manutenção
- Violação do princípio Open/Closed
- Necessidade de alterar a classe sempre que surgir um novo tipo de notificação

O objetivo é mostrar como sistemas sem Observer ficam menos flexíveis.