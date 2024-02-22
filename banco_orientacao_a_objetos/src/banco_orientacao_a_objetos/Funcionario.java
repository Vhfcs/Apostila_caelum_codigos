package banco_orientacao_a_objetos;

public class Funcionario {
		protected String nome;
		protected String cpf;
		protected double salario;
		public	double	getBonificacao() {
			return this.salario * 1.2;
		}
		public boolean autentica(int senha) {
			return false;
			// TODO Auto-generated method stub
			
		}

	}

