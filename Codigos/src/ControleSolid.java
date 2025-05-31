package Codigos.src;

import java.util.ArrayList;
import java.util.List;

public class ControleSolid {

    private final ValidaAluno validadorAluno = new VerificaAluno();
    private final ServicoDebitoAluno servicoDebito = new ServicoDebitoAluno();

    public EmprestimoSolid emprestar(String ra, int[] codigos, int num) {
        boolean retorno = true;
        AlunoSolid aluno = new AlunoSolid(ra);

        // Validação de existência
        if (!validadorAluno.valida(aluno.getRA())) {
            System.out.println("Aluno Inexistente");
            retorno = false;
        }

        // Validação de débito
        if (!servicoDebito.verificaDebito(aluno.getRA())) {
            System.out.println("Aluno em Débito");
            retorno = false;
        }

        if (retorno) {
            List<LivroSolid> livros = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                LivroSolid livro = new LivroSolid(codigos[i]);
                if (!livro.verificaLivro()) {
                    livros.add(livro);
                }
            }

            if (!livros.isEmpty()) {
                EmprestimoSolid emprestimo = new EmprestimoSolid();
                boolean sucesso = emprestimo.emprestar(livros);
                if (sucesso) {
                    return emprestimo;
                }
            }
        }
        return null;
    }
}