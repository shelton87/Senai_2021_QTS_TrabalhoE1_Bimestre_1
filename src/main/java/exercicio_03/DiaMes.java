package exercicio_03;

public class DiaMes {

	boolean validaDiaMes(int qtdDias) {
		if (qtdDias <= 0 || qtdDias > 30) {
			return false;
		} else {
			return true;
		}
	}

}
