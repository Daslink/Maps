package com.bbva.cdrg.dto.rutas.test;

import org.junit.Before;
import org.junit.Test;
import com.bbva.cdrg.dto.rutas.DataIn;
import junit.framework.Assert;

public class DataInTest {
	DataIn data = new DataIn();
	
	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starting(){
		data.setSalida("BOGOTA");
		data.setDestino("SOACHA");
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getSalida(), "BOGOTA");
		Assert.assertEquals(data.getDestino(), "SOACHA");
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
		DataIn data2 = new DataIn();
		int hashCode = data2.hashCode();
		Assert.assertEquals(data2.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence equal()  - enden ok
	 */
	@Test
	public void equalTest(){
		DataIn aux = new DataIn();
		
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setDestino(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setDestino(data.getDestino());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setSalida(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setSalida(data.getSalida());
		
		Assert.assertEquals(data.equals(aux), true);
	}
	
	/**
	 * Method for test the sentence toString()  - enden ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataIn [salida=BOGOTA, destino=SOACHA]");
	}
	/**
	 * Method for test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringTestFail(){
		Assert.assertFalse(data.toString().equals("hola"));
	}
}
