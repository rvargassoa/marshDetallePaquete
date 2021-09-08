package com.mx.marsh.vo;

import java.util.List;



public class ConsultaVehiculoPaquetesResponseVO {

	private String modelo;
    
    private String clavemarca;
    
    private String descripcion;
    
    private List<VehiculoDetalleVO> vehiculoDetalle;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getClavemarca() {
		return clavemarca;
	}

	public void setClavemarca(String clavemarca) {
		this.clavemarca = clavemarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<VehiculoDetalleVO> getVehiculoDetalle() {
		return vehiculoDetalle;
	}

	public void setVehiculoDetalle(List<VehiculoDetalleVO> vehiculoDetalle) {
		this.vehiculoDetalle = vehiculoDetalle;
	}

	@Override
	public String toString() {
		return "ConsultaVehiculoPaquetesResponseVO [modelo=" + modelo + ", clavemarca=" + clavemarca + ", descripcion="
				+ descripcion + ", vehiculoDetalle=" + vehiculoDetalle + "]";
	}
}
