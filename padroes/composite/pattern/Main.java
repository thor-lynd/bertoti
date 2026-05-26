package composite.pattern;

public class Main {

    public static void main(String[] args) {

        Componente arquivo1 = new Arquivo("foto.png");
        Componente arquivo2 = new Arquivo("texto.txt");

        Pasta documentos = new Pasta("Documentos");

        documentos.adicionar(arquivo1);
        documentos.adicionar(arquivo2);

        Pasta principal = new Pasta("Principal");

        principal.adicionar(documentos);

        principal.mostrar();
    }
}   