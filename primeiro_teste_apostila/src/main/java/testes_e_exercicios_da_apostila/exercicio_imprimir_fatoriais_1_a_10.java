package testes_e_exercicios_da_apostila;

public class exercicio_imprimir_fatoriais_1_a_10 {

	public static void main(String[] args) {
		int fatorial = 1;
		for (int n = 1; n <= 10; n++) {
		    fatorial *= n;
		    System.out.println("Fatorial de " + n + " é " + fatorial);
		}


	}

}
