package com.mx.marsh.vo;

import java.util.List;

public class ConsultaPaquetesResponseVO {

	private List<PaqueteDetalladoVO> paqueteDetallado;

	@Override
	public String toString() {
		return "ConsultaPaquetesResponseVO [paqueteDetallado=" + paqueteDetallado + "]";
	}

	public List<PaqueteDetalladoVO> getPaqueteDetallado() {
		return paqueteDetallado;
	}

	public void setPaqueteDetallado(List<PaqueteDetalladoVO> paqueteDetallado) {
		this.paqueteDetallado = paqueteDetallado;
	}
}
