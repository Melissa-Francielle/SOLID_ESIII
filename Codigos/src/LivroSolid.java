package Codigos.src;

public class LivroSolid implements VerificaPrazo {
    TituloSolid titulo;
    int codigo;
    private VerificaLivro regraVerificacao;

    public LivroSolid(int codigo) {
        titulo = new TituloSolid(codigo);
        this.codigo = codigo;
        this.regraVerificacao = new VerificaCodigoLivro();
    }

	@Override
    public int verPrazo() {
        return titulo.getPrazo();
    }

    public boolean verificaLivro() {
        return regraVerificacao.verifica(this.codigo);
    }

    public void setRegraVerificacao(VerificaLivro regra) {
        this.regraVerificacao = regra;
    }
}