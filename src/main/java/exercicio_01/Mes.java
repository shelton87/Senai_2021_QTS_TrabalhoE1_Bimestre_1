package exercicio_01;

public class Mes {

	boolean validaMes(int mes) {
		if (mes <= 0 || mes > 12) {
			return false;
		} else {
			return true;
		}
	}

}