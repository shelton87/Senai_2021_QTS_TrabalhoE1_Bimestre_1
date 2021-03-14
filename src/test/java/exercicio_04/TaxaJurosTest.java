package exercicio_04;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TaxaJurosTest {

	TaxaJuros txJuros = new TaxaJuros();
	
	@Test
	public void testTaxaJurosValida() {

		Assert.assertEquals(true, txJuros.validaTaxaJuros(5.0));
		
	}

	@Test
	public void testTaxaJurosInvalida() {

		Assert.assertEquals(false, txJuros.validaTaxaJuros(20.1));
		
	}
	
}
