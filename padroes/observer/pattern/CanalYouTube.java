package observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class CanalYouTube {

    private List<Observer> inscritos = new ArrayList<>();

    public void adicionarInscrito(Observer observer) {
        inscritos.add(observer);
    }

    public void removerInscrito(Observer observer) {
        inscritos.remove(observer);
    }

    public void publicarVideo(String titulo) {

        System.out.println("Novo vídeo: " + titulo);

        notificarInscritos(titulo);
    }

    private void notificarInscritos(String mensagem) {

        for (Observer observer : inscritos) {
            observer.atualizar(mensagem);
        }
    }
}