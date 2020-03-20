package com.bbva.cdrg.dto.rutas.test;

import org.junit.Before;
import org.junit.Test;
import com.bbva.cdrg.dto.rutas.DataOut;
import junit.framework.Assert;

public class DataOutTest {
	DataOut data = new DataOut();
	
	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starting(){
		data.setDistancia("25km");
		data.setTiempo("30m");
		data.setValorRecorrido("30000");
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getDistancia(), "25km");
		Assert.assertEquals(data.getTiempo(), "30m");
		Assert.assertEquals(data.getValorRecorrido(), "30000");
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeTest(){
		int hashCode = data.hashCode();
		Assert.assertEquals(data.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence hasCode()  - enden fail
	 */
	@Test
	public void hashCodeFail(){
		Assert.assertFalse(((Integer) data.hashCode()).equals(1));
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden fail
	 */
	@Test
	public void hashCodeNull(){
		DataOut data2 = new DataOut();
		int hashCode = data2.hashCode();
		Assert.assertEquals(data2.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence equal()  - enden ok
	 */
	@Test
	public void equalTest(){
		DataOut aux = new DataOut();
		
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setDistancia(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setDistancia(data.getDistancia());
		Assert.assertEquals(data.equals(aux), false);
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setTiempo(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setTiempo(data.getTiempo());
		Assert.assertEquals(data.equals(aux), false);
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setValorRecorrido(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setValorRecorrido(data.getValorRecorrido());
		
		Assert.assertEquals(data.equals(aux), true);
	}
	
	/**
	 * Method for test the sentence toString()  - enden ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataOut [distancia=25km, tiempo=30m, valorRecorrido=30000]");
	}
	/**
	 * Method for test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringTestFail(){
		Assert.assertFalse(data.toString().equals("hola"));
	}
}
