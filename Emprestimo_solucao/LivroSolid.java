package src;

public class Livro {
	Titulo titulo;
	int codigo;
	public Livro(int codigo) {
		//instância um titulo e o associa ao livro
		titulo = new Titulo(codigo);
		this.codigo =codigo;
	}
	WW
	public int verPrazo() {
		return titulo.getPrazo();
	}
	
	public boolean verificaLivro() {
		// TODO Auto-generated method stub
		if (this.codigo == 3)
		  return true;
		 else
		  return false;
	}
    
	
}

