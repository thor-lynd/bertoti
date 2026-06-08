package strategy.pattern;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 =
                new Cliente("João", 10000.0,
                        new EmprestimoPremium());

        Cliente cliente2 =
                new Cliente("Maria", 3000.0,
                        new EmprestimoComum());

        Cliente cliente3 =
                new Cliente("Pedro", 1500.0,
                        new EmprestimoUniversitario());

        cliente1.emprestar();
        cliente2.emprestar();
        cliente3.emprestar();
    }
}