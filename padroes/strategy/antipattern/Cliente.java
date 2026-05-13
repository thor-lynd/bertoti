public class Cliente{

    private String nome;
    private Double saldo;



    public Cliente(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void Emprestar(){
        System.out.println("EMPRESTADO!");
    }
}