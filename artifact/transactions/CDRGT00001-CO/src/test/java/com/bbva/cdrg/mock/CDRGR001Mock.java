package com.bbva.cdrg.mock;

import com.bbva.cdrg.dto.rutas.DataOut;
import com.bbva.cdrg.lib.r001.CDRGR001;

public class CDRGR001Mock implements CDRGR001 {
	
	//Anadir todos los execute que tenga la interfaz de la libreria
	//
	// @Override
	// public valor_de_retorno execute...(Parametro1 param1,...) {
	//
	// 	...
	//	
	// }

	
	//Metodo execute generado por defecto
	
	@Override
	public DataOut execute(String salida, String destino) {
		return  null;
	 	//Anadir codigo de retorno
		
	}
	
}
