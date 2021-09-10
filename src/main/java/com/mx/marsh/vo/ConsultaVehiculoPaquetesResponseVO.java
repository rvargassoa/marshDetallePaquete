package com.mx.marsh.vo;

import java.util.List;

public class ConsultaVehiculoPaquetesResponseVO {

	private String nombre;
    
    private double primaFinal;
    
    private List<CoberturaVO> cobertura;
    
    private List<CoberturaVO> adicional;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrimaFinal() {
		return primaFinal;
	}

	public void setPrimaFinal(double primaFinal) {
		this.primaFinal = primaFinal;
	}

	public List<CoberturaVO> getCobertura() {
		return cobertura;
	}

	public void setCobertura(List<CoberturaVO> cobertura) {
		this.cobertura = cobertura;
	}

	public List<CoberturaVO> getAdicional() {
		return adicional;
	}

	public void setAdicional(List<CoberturaVO> adicional) {
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return "ConsultaVehiculoPaquetesResponseVO [nombre=" + nombre + ", primaFinal=" + primaFinal + ", cobertura="
				+ cobertura + ", adicional=" + adicional + "]";
	}

	
}
