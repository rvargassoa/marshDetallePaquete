package com.mx.marsh.vo;

public class PaqueteConsultaVO {

	private String cp;

	private String descripcion;
    
    private String marca;
    
    private String ramo;
    
    private String submarca;
    
    private String tipovehiculo;

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public String getTipovehiculo() {
		return tipovehiculo;
	}

	public void setTipovehiculo(String tipovehiculo) {
		this.tipovehiculo = tipovehiculo;
	}

	@Override
	public String toString() {
		return "PaqueteConsultaVO [cp=" + cp + ", descripcion=" + descripcion + ", marca=" + marca + ", ramo=" + ramo
				+ ", submarca=" + submarca + ", tipovehiculo=" + tipovehiculo + "]";
	}
    
}
