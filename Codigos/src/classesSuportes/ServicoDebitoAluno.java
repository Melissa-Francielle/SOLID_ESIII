package Codigos.src;

public class ServicoDebitoAluno {
    public boolean verificaDebito(String ra) {
        DebitoSolid debito = new DebitoSolid(Integer.parseInt(ra));
        return debito.verificaDebito();
    }
}