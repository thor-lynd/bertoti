package observer.pattern;

public class Main {

    public static void main(String[] args) {

        CanalYouTube canal = new CanalYouTube();

        Observer joao = new InscritoEmail("João");
        Observer maria = new InscritoPush("Maria");

        canal.adicionarInscrito(joao);
        canal.adicionarInscrito(maria);

        canal.publicarVideo("Aprendendo Observer");
    }
}