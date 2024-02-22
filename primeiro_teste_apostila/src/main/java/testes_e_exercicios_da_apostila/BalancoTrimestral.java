package testes_e_exercicios_da_apostila;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastoJaneiro = 1500;
		int gastoFevereiro = 2300;
		int gastoMarco = 1700;
		
		int gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		int mediaMensal = gastoTrimestre / 2;
		
		System.out.println("Valor da média mensal=: " + mediaMensal);
			
	}

}
