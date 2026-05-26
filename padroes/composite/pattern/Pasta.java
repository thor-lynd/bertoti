package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Componente {

    private String nome;

    private List<Componente> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(Componente componente) {
        itens.add(componente);
    }

    @Override
    public void mostrar() {

        System.out.println("Pasta: " + nome);

        for (Componente item : itens) {
            item.mostrar();
        }
    }
}