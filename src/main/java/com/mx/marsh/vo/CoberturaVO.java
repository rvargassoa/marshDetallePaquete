package com.mx.marsh.vo;

public class CoberturaVO {

	private String clave;
    
    private String deducible;
    
    private String nombre;
    
    private double monto;

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

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "VehiculoDetalleVO [clave=" + clave + ", deducible=" + deducible + ", nombre=" + nombre + ", monto="
				+ monto + "]";
	}
}
