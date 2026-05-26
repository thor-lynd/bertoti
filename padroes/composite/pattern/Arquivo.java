package composite.pattern;

public class Arquivo implements Componente {

    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void mostrar() {
        System.out.println("Arquivo: " + nome);
    }
}