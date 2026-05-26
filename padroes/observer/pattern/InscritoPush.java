package observer.pattern;

public class InscritoPush implements Observer {

    private String nome;

    public InscritoPush(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu push: " + mensagem);
    }
}