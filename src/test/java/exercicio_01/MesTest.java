package exercicio_01;

import static org.junit.Assert.*;

import org.junit.Test;

import exercicio_01.Mes;
import junit.framework.Assert;

public class MesTest {

	@Test
	public void testValidaMesValido() {
		
		Mes mes = new Mes();
		int entrada = 1;
		boolean resultadoEsperado = true;
		boolean resultadoPrograma = mes.validaMes(entrada);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}
	
	@Test
	public void testValidaMesInvalido() {
		
		Mes mes = new Mes();
		int entrada = 0;
		boolean resultadoEsperado = false;
		boolean resultadoPrograma = mes.validaMes(entrada);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
	}

}
