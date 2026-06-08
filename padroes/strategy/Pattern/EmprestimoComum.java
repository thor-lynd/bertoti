package strategy.pattern;

public class EmprestimoComum implements EstrategiaEmprestimo {

    @Override
    public void emprestar() {
        System.out.println("Empréstimo Comum aprovado!");
    }
}