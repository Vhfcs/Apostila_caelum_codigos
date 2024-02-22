package banco_orientacao_a_objetos;

public class Gerente {

	public class gerente	{
		private	String	nome;
		private	String	cpf;
		private double	salario;
		private int	senha;
		private int	numeroDeFuncionariosGerenciados;
		public	boolean	autentica(int	senha) {
			return true;
		}
	}

	private double salario;
	private int senha;
	public	double	getBonificacao() {
		return this.salario	* 	1.4	+	1000;
	}

	public	boolean	autentica(int	senha) {
		if	(this.senha	==	senha)	{
			System.out.println("Acesso	Permitido!");
			return true;
		}	else	{
			System.out.println("Acesso	Negado!");
			return false;
		}
	}

	public class gerente1 extends Funcionario implements Autenticavel	{
		private int	senha;
		//	outros	atributos	e	métodos
		public	boolean	autentica(int	senha) {
			if(this.senha	!=	senha)	{
				return false;
			}
			//	pode	fazer	outras	possíveis	verificações,	como	saber	se	esse
			//	departamento	do	gerente	tem	acesso	ao	Sistema
			return true;
		}
	}



	public void setNome(String string) {
		// TODO Auto-generated method stub

	}

	public void setSenha(int i) {
		// TODO Auto-generated method stub

	}
}