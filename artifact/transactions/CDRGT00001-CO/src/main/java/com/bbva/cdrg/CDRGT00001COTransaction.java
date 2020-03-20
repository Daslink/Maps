package com.bbva.cdrg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.cdrg.dto.rutas.DataIn;
import com.bbva.cdrg.dto.rutas.DataOut;
import com.bbva.cdrg.lib.r001.CDRGR001;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;

/**
 * Transancion
 * Implementacion de logica de negocio.
 * @author hdramos
 *
 */
public class CDRGT00001COTransaction extends AbstractCDRGT00001COTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(CDRGT00001COTransaction.class);

	@Override
	public void execute() {
		CDRGR001 CDRGR001 = (CDRGR001) getServiceLibrary(CDRGR001.class);
		DataIn dataIn = this.getDataIn();
		DataOut dataOut = CDRGR001.execute(dataIn.getSalida(), dataIn.getDestino());
		System.out.println(dataOut.toString());	
		LOGGER.debug("Successful search");
		setContentLocation(getURIPath());
		setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		this.setDataOut(dataOut);
	}
}
