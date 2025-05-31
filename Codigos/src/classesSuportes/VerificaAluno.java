package Codigos.src;

public class VerificaAluno implements ValidaAluno {
    @Override
    public boolean valida(String ra) {
        return !ra.equals("10");
    }
}
