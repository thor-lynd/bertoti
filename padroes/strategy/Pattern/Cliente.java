package strategy.pattern;

public class Cliente {

    private String nome;
    private Double saldo;
    private EstrategiaEmprestimo estrategia;

    public Cliente(String nome, Double saldo,
                   EstrategiaEmprestimo estrategia) {
        this.nome = nome;
        this.saldo = saldo;
        this.estrategia = estrategia;
    }

    public void emprestar() {
        estrategia.emprestar();
    }

    public void setEstrategia(EstrategiaEmprestimo estrategia) {
        this.estrategia = estrategia;
    }
}