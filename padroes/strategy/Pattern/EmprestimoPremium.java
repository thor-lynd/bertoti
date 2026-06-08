package strategy.pattern;


public class EmprestimoPremium implements EstrategiaEmprestimo {

    @Override
    public void emprestar() {
        System.out.println("Empréstimo Premium aprovado!");
    }
}