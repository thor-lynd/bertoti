package composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class Pasta {

    private String nome;

    private List<Arquivo> arquivos = new ArrayList<>();
    private List<Pasta> pastas = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void adicionarPasta(Pasta pasta) {
        pastas.add(pasta);
    }

    public void mostrar() {

        System.out.println("Pasta: " + nome);

        for (Arquivo arquivo : arquivos) {
            arquivo.mostrar();
        }

        for (Pasta pasta : pastas) {
            pasta.mostrar();
        }
    }
}