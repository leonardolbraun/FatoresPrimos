package test;

import static org.junit.Assert.*;

import org.junit.Test;

import lib.FatoraPrimos;

public class FatoraPrimosTest {

	@Test
	public void deveriaRetornar5QuandoAEntradaForIgualA5() {
		FatoraPrimos fatora = new FatoraPrimos(); 
		assertEquals(fatora.encontraFatoresPrimosPara(5), "5");
	}
}
