package com.google.buscador.venta.bean;

public class ClienteBean {
	
	private int codCliente;
	private String nomCliente;
	private String apeCliente;
	private String dniDocente;
	private String fecnacCliente;
	private TipoBean tipo;
	
	
	public int getCodCliente() {
		return codCliente;
	}
	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}
	public String getNomCliente() {
		return nomCliente;
	}
	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}
	public String getApeCliente() {
		return apeCliente;
	}
	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}
	public String getDniDocente() {
		return dniDocente;
	}
	public void setDniDocente(String dniDocente) {
		this.dniDocente = dniDocente;
	}
	public String getFecnacCliente() {
		return fecnacCliente;
	}
	public void setFecnacCliente(String fecnacCliente) {
		this.fecnacCliente = fecnacCliente;
	}
	public TipoBean getTipo() {
		return tipo;
	}
	public void setTipo(TipoBean tipo) {
		this.tipo = tipo;
	}
	
	
	

}
