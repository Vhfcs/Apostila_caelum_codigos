package banco_orientacao_a_objetos;

public class banco_tipo {
	public static class Cliente	{
		private	String	nome;
		private	String	endereco;
		private	String	cpf;
		private int	idade;

		public	void	mudaCPF(String	cpf) {
			if	(this.idade	<=	60)	{
				validaCPF(cpf);
			}
			this.cpf = cpf;
		}
		private	void validaCPF(String	cpf) {
		}
	}

	public static class Conta {
		int	numero;
		double	saldo;
		Cliente titular;

		void transfere(Conta destino, double valor) {
			if(this.saldo >= valor) {
				this.saldo = this.saldo	- valor;
				destino.saldo =	destino.saldo + valor;
			}
		}

		public void deposita(double valor) {
			this.saldo += valor;
		}

		public double getSaldo() {
			// TODO Auto-generated method stub
			return 0;
		}

	}

	public class Gerente extends Funcionario	{
		private int	senha;
		private int	numeroDeFuncionariosGerenciados;
		public	boolean	autentica(int	senha) {
			if	(this.senha	==	senha)	{
				System.out.println("Acesso	Permitido!");
				return true;
			}	else	{
				System.out.println("Acesso	Negado!");
				return false;
			}

		}
		//	setter	da	senha	omitido
	}

	class Programa{
		public static void main(String [] args) {
			Conta	c1	=	new	Conta();
			Cliente cliente1 = new Cliente();
			cliente1.nome = "Duke";
			c1.titular	=	cliente1;
			c1.saldo	=	227;
			Conta	c2	=	new	Conta();
			Cliente cliente2 = new Cliente();
			cliente2.nome = "Duke";
			c2.titular	=	cliente2;
			c2.saldo	=	227;
			if	(c1.titular.nome.equals(c2.titular.nome) && c1.saldo == c2.saldo)	{
				System.out.println("Contas	iguais");
			}

			class TestaArrays {
				public static void main(String[] args) {
					Conta[] contas = new Conta[10];
					for (int i = 0; i < contas.length; i++) {
						Conta conta = new ContaCorrente();
						conta.deposita(i * 100.0);
						contas[i] = conta;
					}

					// Calcula a soma dos saldos
					double soma = 0;
					for (int i = 0; i < contas.length; i++) {
						soma += contas[i].getSaldo();
					}

					// Calcula a média
					double media = soma / contas.length;

					// Imprime a média
					System.out.println("A média dos saldos é: " + media);
				}
			}


		}
	}
}
