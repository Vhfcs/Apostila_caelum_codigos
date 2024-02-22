package banco_orientacao_a_objetos;

public class SistemaInterno {
	public void login(Funcionario funcionario) {
		int senha = 1234; // Inicialize a senha aqui
		boolean ok = funcionario.autentica(senha);
	}
}
