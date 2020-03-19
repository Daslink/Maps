package com.bbva.cdrg.dto.rutas;

import com.bbva.apx.dto.AbstractDTO;

public class DataIn extends AbstractDTO{
	private static final long serialVersionUID = 5502787144844274029L;
	private String salida;
	private String destino;
	
	
	/**
	 * Constructor
	 */
	public DataIn(){
		
	}
	
	/**
	 * @return
	 * Method to get
	 */
	public String getSalida() {
		return salida;
	}
	/**
	 * @param salida
	 * Method to set
	 */
	public void setSalida(String salida) {
		this.salida = salida;
	}
	/**
	 * @return
	 * Method to get
	 */
	public String getDestino() {
		return destino;
	}
	/**
	 * @param destino
	 * Method to set
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destino == null) ? 0 : destino.hashCode());
		result = prime * result + ((salida == null) ? 0 : salida.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataIn other = (DataIn) obj;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (salida == null) {
			if (other.salida != null)
				return false;
		} else if (!salida.equals(other.salida))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataIn [salida=" + salida + ", destino=" + destino + "]";
	}	
	
}
