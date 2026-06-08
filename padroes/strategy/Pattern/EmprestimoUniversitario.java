package strategy.pattern;

public class EmprestimoUniversitario implements EstrategiaEmprestimo {

    @Override
    public void emprestar() {
        System.out.println("Empréstimo Universitário aprovado!");
    }
}