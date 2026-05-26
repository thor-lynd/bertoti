package composite.antipattern;

public class Main {

    public static void main(String[] args) {

        Arquivo arquivo1 = new Arquivo("foto.png");
        Arquivo arquivo2 = new Arquivo("texto.txt");

        Pasta documentos = new Pasta("Documentos");

        documentos.adicionarArquivo(arquivo1);
        documentos.adicionarArquivo(arquivo2);

        Pasta principal = new Pasta("Principal");

        principal.adicionarPasta(documentos);

        principal.mostrar();
    }
}