package com.mx.marsh.service;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesRequest;
import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesResponse;
import com.marsh.paquetedetalle.VehiculoDetalle;
import com.mx.marsh.vo.ConsultaVehiculoPaquetesResponseVO;
import com.mx.marsh.vo.VehiculoDetalleVO;
import com.mx.marsh.vo.VehiculoVO;

@Service
public class ConsultaPaquetesService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaPaquetesService.class);
	private static ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponseSt = new ConsultaVehiculoPaquetesResponse();
	
	@PostConstruct
	public void inicialize() {
		ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().clear();
		//----------------------------
		List <VehiculoDetalle>listaResp = this.obtieneCoberturasSt("Basica");
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaResp);
	}
	
	public ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetes (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		LOGGER.info("Inicia consultaVehiculoPaquetes------------------------------------------------------------------------------");
		VehiculoVO vehiculoVO = new VehiculoVO();
		ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		ConsultaVehiculoPaquetesResponseVO consultaVehiculoPaquetesResponseVO = new ConsultaVehiculoPaquetesResponseVO();
		List <VehiculoDetalle>listaVehiculoDetalle = new ArrayList<>();
		vehiculoVO.setClavedescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getClavedescripcion());
		vehiculoVO.setTipovehiculo(consultaVehiculoPaquetesRequest.getVehiculo().getTipovehiculo());
	    vehiculoVO.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
	    vehiculoVO.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
	    vehiculoVO.setClavesubmarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavesubmarca());
	    vehiculoVO.setMail(consultaVehiculoPaquetesRequest.getVehiculo().getMail());
	    vehiculoVO.setSexo(consultaVehiculoPaquetesRequest.getVehiculo().getSexo());
	    vehiculoVO.setTelefono(consultaVehiculoPaquetesRequest.getVehiculo().getTelefono());
	    vehiculoVO.setCp(consultaVehiculoPaquetesRequest.getVehiculo().getCp());
	    vehiculoVO.setMarca(consultaVehiculoPaquetesRequest.getVehiculo().getMarca());
	    vehiculoVO.setSubmarca(consultaVehiculoPaquetesRequest.getVehiculo().getSubmarca());
	    vehiculoVO.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
	    vehiculoVO.setFechanac(consultaVehiculoPaquetesRequest.getVehiculo().getFechanac());
	    vehiculoVO.setEdad(consultaVehiculoPaquetesRequest.getVehiculo().getEdad());
	    vehiculoVO.setIniciovig(consultaVehiculoPaquetesRequest.getVehiculo().getIniciovig());
	    vehiculoVO.setFinvig(consultaVehiculoPaquetesRequest.getVehiculo().getFinvig());
	    vehiculoVO.setTipoCotizacion(consultaVehiculoPaquetesRequest.getVehiculo().getTipoCotizacion());
	    vehiculoVO.setTipoPaquete(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
		LOGGER.info("Request ConsultaVehiculoPaquetesRequest: {}", vehiculoVO);
		consultaVehiculoPaquetesResponseVO.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
		consultaVehiculoPaquetesResponseVO.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
		consultaVehiculoPaquetesResponseVO.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
		consultaVehiculoPaquetesResponseVO.setVehiculoDetalle(getVehiculoPaquetes(vehiculoVO));
		LOGGER.info("Request ConsultaVehiculoPaquetesResponse: {}", consultaVehiculoPaquetesResponseVO);
		
		consultaVehiculoPaquetesResponse.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
		consultaVehiculoPaquetesResponse.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
		consultaVehiculoPaquetesResponse.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
		for(VehiculoDetalleVO vehiculoDetalleVO : consultaVehiculoPaquetesResponseVO.getVehiculoDetalle()) {
			VehiculoDetalle vehiculoDetalle = new VehiculoDetalle();
			vehiculoDetalle.setClave(vehiculoDetalleVO.getClave());
			vehiculoDetalle.setDeducible(vehiculoDetalleVO.getDeducible());
			vehiculoDetalle.setNombre(vehiculoDetalleVO.getNombre());
			listaVehiculoDetalle.add(vehiculoDetalle);
		}
		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaVehiculoDetalle);
		return consultaVehiculoPaquetesResponse;
	}
	
	private List<VehiculoDetalleVO> getVehiculoPaquetes (VehiculoVO vehiculoVO) {
//		consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
//		consultaVehiculoPaquetesResponse.getVehiculoDetalle().clear();
		List <VehiculoDetalleVO>listaResp = this.obtieneCoberturas(vehiculoVO.getTipoPaquete());
//		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaResp);
		return listaResp;
	}
	
	private List <VehiculoDetalleVO> obtieneCoberturas(String tipoPaquete) {
		List <VehiculoDetalleVO>lista1 = new ArrayList<>();
		List <VehiculoDetalleVO>lista2 = new ArrayList<>();
		List <VehiculoDetalleVO>lista3 = new ArrayList<>();
		List <VehiculoDetalleVO>lista4 = new ArrayList<>();
		List <VehiculoDetalleVO>listaResp = new ArrayList<>();
		VehiculoDetalleVO vd = new VehiculoDetalleVO();
		vd.setClave("cris");
		vd.setDeducible("3");
		vd.setNombre("Cristales");
		lista1.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("av");
		vd.setDeducible("3");
		vd.setNombre("Asistencia vial");
		lista1.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("asus");
		vd.setDeducible("si");
		vd.setNombre("sustituto");
		lista2.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("agencia");
		vd.setDeducible("si");
		vd.setNombre("Siempre en agencia");
		lista2.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("dmllr");
		vd.setDeducible("20");
		vd.setNombre("Daños materiales de llantas o rines");
		lista3.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Parcial");
		lista3.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Total");
		lista4.add(vd);
		vd = new VehiculoDetalleVO();
		vd.setClave("rt");
		vd.setDeducible("3");
		vd.setNombre("Robo total");
		lista4.add(vd);
		if(tipoPaquete.equalsIgnoreCase("Basica")) {
			listaResp.addAll(lista1);
		}
		if(tipoPaquete.equalsIgnoreCase("Limitada")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
		}
		if(tipoPaquete.equalsIgnoreCase("Amplia")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
		}
		if(tipoPaquete.equalsIgnoreCase("Premium")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
			listaResp.addAll(lista4);
		}
		
		return listaResp;
	}
	
	private ConsultaVehiculoPaquetesResponse getVehiculoPaquetesSt (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		consultaVehiculoPaquetesResponseSt = new ConsultaVehiculoPaquetesResponse();
		consultaVehiculoPaquetesResponseSt.getVehiculoDetalle().clear();
		List <VehiculoDetalle>listaResp = this.obtieneCoberturasSt(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
		consultaVehiculoPaquetesResponseSt.getVehiculoDetalle().addAll(listaResp);
		consultaVehiculoPaquetesResponseSt.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
		consultaVehiculoPaquetesResponseSt.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
		consultaVehiculoPaquetesResponseSt.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
		return consultaVehiculoPaquetesResponseSt;
	}
	
	private List <VehiculoDetalle> obtieneCoberturasSt(String tipoPaquete) {
		List <VehiculoDetalle>lista1 = new ArrayList<>();
		List <VehiculoDetalle>lista2 = new ArrayList<>();
		List <VehiculoDetalle>lista3 = new ArrayList<>();
		List <VehiculoDetalle>lista4 = new ArrayList<>();
		List <VehiculoDetalle>listaResp = new ArrayList<>();
		VehiculoDetalle vd = new VehiculoDetalle();
		vd.setClave("cris");
		vd.setDeducible("3");
		vd.setNombre("Cristales");
		lista1.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("av");
		vd.setDeducible("3");
		vd.setNombre("Asistencia vial");
		lista1.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("asus");
		vd.setDeducible("si");
		vd.setNombre("sustituto");
		lista2.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("agencia");
		vd.setDeducible("si");
		vd.setNombre("Siempre en agencia");
		lista2.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmllr");
		vd.setDeducible("20");
		vd.setNombre("Daños materiales de llantas o rines");
		lista3.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Parcial");
		lista3.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Total");
		lista4.add(vd);
		vd = new VehiculoDetalle();
		vd.setClave("rt");
		vd.setDeducible("3");
		vd.setNombre("Robo total");
		lista4.add(vd);
		if(tipoPaquete.equalsIgnoreCase("Basica")) {
			listaResp.addAll(lista1);
		}
		if(tipoPaquete.equalsIgnoreCase("Limitada")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
		}
		if(tipoPaquete.equalsIgnoreCase("Amplia")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
		}
		if(tipoPaquete.equalsIgnoreCase("Premium")) {
			listaResp.addAll(lista1);
			listaResp.addAll(lista2);
			listaResp.addAll(lista3);
			listaResp.addAll(lista4);
		}
		
		return listaResp;
	}
	
}
