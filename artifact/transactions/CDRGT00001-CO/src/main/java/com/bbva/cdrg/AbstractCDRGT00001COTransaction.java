package com.bbva.cdrg;

import com.bbva.cdrg.dto.rutas.DataIn;
import com.bbva.cdrg.dto.rutas.DataOut;
import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractCDRGT00001COTransaction extends AbstractTransaction {

	public AbstractCDRGT00001COTransaction(){
	}
	
	/**
	 * @return
	 * Method to get
	 */
	protected DataIn getDataIn(){
		return (DataIn)getParameter("dataIn");
	}
	
	/**
	 * Set value for output parameter DataOut
	 */
	protected void setDataOut(final DataOut field){
		this.addParameter("DataIn", field);
	}			
	
}
