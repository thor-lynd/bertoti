package observer.pattern;

public class InscritoEmail implements Observer {

    private String nome;

    public InscritoEmail(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu email: " + mensagem);
    }
}