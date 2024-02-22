package banco_orientacao_a_objetos;

public class controleDeBonificacoes {
	class ControleDeBonificacoes	{
		private double	totalDeBonificacoes	=	0;
		public	void	registra(Funcionario	funcionario) {
			this.totalDeBonificacoes	+=	funcionario.getBonificacao();
		}
		public	double	getTotalDeBonificacoes() {
			return this.totalDeBonificacoes;
		}
	}


}
