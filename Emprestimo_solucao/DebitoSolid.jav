/* O código fere o conceito de Open Close, pois a classe Debito não está aberta para extensão e sim para modificação.
 no if, caso necessite adicionar mais alunos com débito, será necessário modificar o código.
 */
package src;

public class Debito {
	int codigoAluno;
	public Debito(int aluno){
		this.codigoAluno =aluno;
	}
	
	public boolean verificaDebito()
	{
	//codigo aleatorio para definir se o aluno tem débito
	//é necessário fazer a verificação de forma persistente
	if(this.codigoAluno == 4)
		 return false;
	 else
		return true;
	}

}