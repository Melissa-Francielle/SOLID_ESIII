package Codigos.src;

import java.util.List;

public class ServicoEmprestimoAluno {
    public boolean emprestar(List<LivroSolid> livros) {
        EmprestimoSolid e = new EmprestimoSolid();
        return e.emprestar(livros);
    }
}