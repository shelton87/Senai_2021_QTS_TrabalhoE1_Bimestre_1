package exercicio_02;

import static org.junit.Assert.*;

import org.junit.Test;

import exercicio_02.TamanhoTexto;
import junit.framework.Assert;

public class TamanhoTextoTest {

	@Test
	public void testRetornaTamanhoTextoValido() {

		TamanhoTexto texto = new TamanhoTexto();
		String entrada = "teste";
		int resultadoEsperado = 5;
		int resultadoPrograma = texto.retornaTamanhoTexto(entrada);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
		
	}
	
	@Test
	public void testRetornaTamanhoTextoInvalido() {

		TamanhoTexto texto = new TamanhoTexto();
		String entrada = "";
		int resultadoEsperado = 0;
		int resultadoPrograma = texto.retornaTamanhoTexto(entrada);
		Assert.assertEquals(resultadoEsperado, resultadoPrograma);
		
	}

}
