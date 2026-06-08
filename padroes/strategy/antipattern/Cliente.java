public class Cliente {

    private String nome;
    private Double saldo;
    private String tipoCliente;

    public Cliente(String nome, Double saldo, String tipoCliente) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoCliente = tipoCliente;
    }

    public void emprestar() {

        if ("PREMIUM".equals(tipoCliente)) {
            System.out.println("Empréstimo Premium aprovado!");
        }
        else if ("COMUM".equals(tipoCliente)) {
            System.out.println("Empréstimo Comum aprovado!");
        }
        else if ("UNIVERSITARIO".equals(tipoCliente)) {
            System.out.println("Empréstimo Universitário aprovado!");
        }
        else if ("EMPRESARIAL".equals(tipoCliente)) {
            System.out.println("Empréstimo Empresarial aprovado!");
        }
        else {
            System.out.println("Empréstimo negado!");
        }
    }
}