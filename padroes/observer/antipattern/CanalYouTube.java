package observer.antipattern;

public class CanalYouTube {

    public void publicarVideo(String titulo) {

        System.out.println("Vídeo publicado: " + titulo);

        System.out.println("Email enviado");
        System.out.println("Push enviado");
        System.out.println("SMS enviado");
    }
}