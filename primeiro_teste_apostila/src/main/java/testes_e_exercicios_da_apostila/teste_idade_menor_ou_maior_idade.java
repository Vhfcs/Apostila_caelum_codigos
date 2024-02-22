package testes_e_exercicios_da_apostila;

public class teste_idade_menor_ou_maior_idade {
	public	static	void	main(String[]	args) {
		int idade = 15;
		boolean amigoDoDono = true;
		if (idade < 18 && amigoDoDono == false) {
			System.out.println("Não pode entrar");
		}
		else { 
			System.out.println("Pode entrar");
		}
	}
}
