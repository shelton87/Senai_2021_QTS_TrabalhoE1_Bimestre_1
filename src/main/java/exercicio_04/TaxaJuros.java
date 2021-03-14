package exercicio_04;

public class TaxaJuros {
	
	boolean validaTaxaJuros(Double txJuros) {
		if (txJuros < 5 || txJuros > 20) {
			return false;
		} else {
			return true;
		}
	}

}
