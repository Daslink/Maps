package com.bbva.cdrg.dto.rutas;

import com.bbva.apx.dto.AbstractDTO;

public class DataOut extends AbstractDTO{
	private static final long serialVersionUID = -360580309918743122L;
	private String distancia;
	private String tiempo;
	private String valorRecorrido;
	
	/**
	 * Constructor
	 */
	public DataOut(){}
	
	/**
	 * @return
	 * Method to get
	 */
	public String getDistancia() {
		return distancia;
	}
	/**
	 * @param distancia
	 * Method to set
	 */
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	/**
	 * @return
	 * Method to get
	 */
	public String getTiempo() {
		return tiempo;
	}
	/**
	 * @param tiempo
	 * Method to set
	 */
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	/**
	 * @return
	 * Method to get
	 */
	public String getValorRecorrido() {
		return valorRecorrido;
	}
	/**
	 * @param valorRecorrido
	 * Method to set
	 */
	public void setValorRecorrido(String valorRecorrido) {
		this.valorRecorrido = valorRecorrido;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((distancia == null) ? 0 : distancia.hashCode());
		result = prime * result + ((tiempo == null) ? 0 : tiempo.hashCode());
		result = prime * result + ((valorRecorrido == null) ? 0 : valorRecorrido.hashCode());
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
		DataOut other = (DataOut) obj;
		if (distancia == null) {
			if (other.distancia != null)
				return false;
		} else if (!distancia.equals(other.distancia))
			return false;
		if (tiempo == null) {
			if (other.tiempo != null)
				return false;
		} else if (!tiempo.equals(other.tiempo))
			return false;
		if (valorRecorrido == null) {
			if (other.valorRecorrido != null)
				return false;
		} else if (!valorRecorrido.equals(other.valorRecorrido))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataOut [distancia=" + distancia + ", tiempo=" + tiempo + ", valorRecorrido=" + valorRecorrido + "]";
	}
	
	


}
