package exercicio_03;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DiaMesTest {

	DiaMes dias = new DiaMes();
	
	@Test
	public void testValidaDiaMesValido() {

		Assert.assertEquals(true, dias.validaDiaMes(30));		
		
	}
	
	@Test
	public void testValidaDiaMesInvalido() {

		Assert.assertEquals(false, dias.validaDiaMes(31));		
		
	}

}
