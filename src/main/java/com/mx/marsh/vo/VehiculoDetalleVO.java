package com.mx.marsh.vo;

public class VehiculoDetalleVO {

	private String clave;
    
    private String deducible;
    
    private String nombre;

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDeducible() {
		return deducible;
	}

	public void setDeducible(String deducible) {
		this.deducible = deducible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "VehiculoDetalleVO [clave=" + clave + ", deducible=" + deducible + ", nombre=" + nombre + "]";
	}
}
