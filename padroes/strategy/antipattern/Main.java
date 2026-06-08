public class Main {

    public static void main(String[] args) {

        Cliente cliente1 =
                new Cliente("João", 10000.0, "PREMIUM");

        Cliente cliente2 =
                new Cliente("Maria", 3000.0, "COMUM");

        Cliente cliente3 =
                new Cliente("Pedro", 2000.0, "UNIVERSITARIO");

        cliente1.emprestar();
        cliente2.emprestar();
        cliente3.emprestar();
    }
}