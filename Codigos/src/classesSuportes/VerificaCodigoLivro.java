package Codigos.src;

public class VerificaCodigoLivro implements VerificaLivro {
    @Override
    public boolean verifica(int codigo) {
        return codigo == 3;
    }
}