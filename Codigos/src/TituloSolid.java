package Codigos.src;

public class TituloSolid{
    int prazo;
    public TituloSolid(int codigo){
        this.prazo = codigo+1;
    }
    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

}