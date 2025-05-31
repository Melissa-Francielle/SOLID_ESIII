package Codigos.src;

public class VerificadorDebito implements VerificaDebito {
    @Override
    public boolean verifica(int codigoAluno) {
        return codigoAluno != 4;
    }
}