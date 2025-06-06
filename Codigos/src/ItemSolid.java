package Codigos.src;

import java.util.Calendar;
import java.util.Date;

public class ItemSolid {
	LivroSolid livro;
    Date dataDevolucao;
    
	public ItemSolid(LivroSolid livro) {
		super();
		this.livro = livro;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public LivroSolid getLivro() {
		return livro;
	}

	public void setLivro(LivroSolid livro) {
		this.livro = livro;
	}
	
	public Date calculaDataDevolucao(Date data){
       dataDevolucao=data;
	   Calendar calendar = Calendar.getInstance();
	   calendar.setTime(data);
	   calendar.add(Calendar.DATE, livro.verPrazo());
       dataDevolucao = calendar.getTime();
	   return dataDevolucao;
	}

}
