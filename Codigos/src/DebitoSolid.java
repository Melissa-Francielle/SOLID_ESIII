package Codigos.src;

public class DebitoSolid {
    int codigoAluno;
    private VerificadorDebito verificadorDebito;

    public DebitoSolid(int aluno) {
        this.codigoAluno = aluno;
        this.verificadorDebito = new VerificadorDebito(); // padrão
    }

    public void setVerificadorDebito(VerificadorDebito verificador) {
        this.verificadorDebito = verificador;
    }

    public boolean verificaDebito() {
        return verificadorDebito.verifica(this.codigoAluno);
    }
}