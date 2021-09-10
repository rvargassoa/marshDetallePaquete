package com.mx.marsh.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.marsh.paquetedetalle.Cobertura;
import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesRequest;
import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesResponse;
import com.mx.marsh.vo.ConsultaVehiculoPaquetesResponseVO;
import com.mx.marsh.vo.CoberturaVO;
import com.mx.marsh.vo.VehiculoVO;

@Service
public class ConsultaPaquetesService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ConsultaPaquetesService.class);
	private static ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponseSt = new ConsultaVehiculoPaquetesResponse();
	
	@PostConstruct
	public void inicialize() {
		ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		consultaVehiculoPaquetesResponse.getCobertura().clear();
		//----------------------------
		consultaVehiculoPaquetesResponse = this.obtieneCoberturasSt("Basica");
	}
	
	public ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetes (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		LOGGER.info("Inicia consultaVehiculoPaquetes------------------------------------------------------------------------------");
		VehiculoVO vehiculoVO = new VehiculoVO();
		ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		ConsultaVehiculoPaquetesResponseVO consultaVehiculoPaquetesResponseVO = new ConsultaVehiculoPaquetesResponseVO();
		List <Cobertura>listaVehiculoDetalle = new ArrayList<>();
		List <Cobertura>listaVehiculoDetalle2 = new ArrayList<>();
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
		consultaVehiculoPaquetesResponseVO.setNombre(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
		consultaVehiculoPaquetesResponseVO = obtieneCoberturas(vehiculoVO.getTipoPaquete());
		LOGGER.info("Request ConsultaVehiculoPaquetesResponse: {}", consultaVehiculoPaquetesResponseVO);
		
		consultaVehiculoPaquetesResponse.setNombre(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
		consultaVehiculoPaquetesResponse.setPrimaFinal(consultaVehiculoPaquetesResponseVO.getPrimaFinal());
		for(CoberturaVO vehiculoDetalleVO : consultaVehiculoPaquetesResponseVO.getCobertura()) {
			Cobertura vehiculoDetalle = new Cobertura();
			vehiculoDetalle.setClave(vehiculoDetalleVO.getClave());
			vehiculoDetalle.setDeducible(vehiculoDetalleVO.getDeducible());
			vehiculoDetalle.setNombre(vehiculoDetalleVO.getNombre());
			vehiculoDetalle.setMonto(vehiculoDetalleVO.getMonto());
			listaVehiculoDetalle.add(vehiculoDetalle);
		}
		
		for(CoberturaVO vehiculoDetalleVO : consultaVehiculoPaquetesResponseVO.getAdicional()) {
			Cobertura vehiculoDetalle2 = new Cobertura();
			vehiculoDetalle2.setClave(vehiculoDetalleVO.getClave());
			vehiculoDetalle2.setDeducible(vehiculoDetalleVO.getDeducible());
			vehiculoDetalle2.setNombre(vehiculoDetalleVO.getNombre());
			vehiculoDetalle2.setMonto(vehiculoDetalleVO.getMonto());
			listaVehiculoDetalle2.add(vehiculoDetalle2);
		}
		
		consultaVehiculoPaquetesResponse.getCobertura().addAll(listaVehiculoDetalle);
		consultaVehiculoPaquetesResponse.getAdicional().addAll(listaVehiculoDetalle2);
		return consultaVehiculoPaquetesResponse;
	}
	
//	private List<CoberturaVO> getVehiculoPaquetes (VehiculoVO vehiculoVO) {
//		consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
//		consultaVehiculoPaquetesResponse.getVehiculoDetalle().clear();
//		List <CoberturaVO>listaResp = this.obtieneCoberturas(vehiculoVO.getTipoPaquete());
//		consultaVehiculoPaquetesResponse.getVehiculoDetalle().addAll(listaResp);
//		return listaResp;
//	}
	
	private ConsultaVehiculoPaquetesResponseVO obtieneCoberturas(String tipoPaquete) {
		ConsultaVehiculoPaquetesResponseVO consultaVehiculoPaquetesResponseVO = new ConsultaVehiculoPaquetesResponseVO();
		List <CoberturaVO>lista1 = new ArrayList<>();
		List <CoberturaVO>lista2 = new ArrayList<>();
		List <CoberturaVO>lista3 = new ArrayList<>();
		List <CoberturaVO>lista4 = new ArrayList<>();
		List <CoberturaVO>sust1 = new ArrayList<>();
		List <CoberturaVO>listaResp = new ArrayList<>();
		List <CoberturaVO>listaResp2 = new ArrayList<>();
		CoberturaVO vd = new CoberturaVO();
		vd.setClave("cris");
		vd.setDeducible("3");
		vd.setNombre("Cristales");
		vd.setMonto(1000);
		lista1.add(vd);
		vd = new CoberturaVO();
		vd.setClave("av");
		vd.setDeducible("3");
		vd.setNombre("Asistencia vial");
		vd.setMonto(1000);
		lista1.add(vd);
		vd = new CoberturaVO();
		vd.setClave("aj");
		vd.setDeducible("3");
		vd.setNombre("Asistencia Juridica");
		vd.setMonto(2000);
		lista2.add(vd);
		vd = new CoberturaVO();
		vd.setClave("rc");
		vd.setDeducible("3");
		vd.setNombre("Responsabilidad Catastrofica");
		vd.setMonto(2000);
		lista2.add(vd);
		vd = new CoberturaVO();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Parcial");
		vd.setMonto(2500);
		lista3.add(vd);
		vd = new CoberturaVO();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Total");
		vd.setMonto(2500);
		lista4.add(vd);
		vd = new CoberturaVO();
		vd.setClave("rt");
		vd.setDeducible("3");
		vd.setNombre("Robo total");
		vd.setMonto(1500);
		lista4.add(vd);
		
		vd = new CoberturaVO();
		vd.setNombre("Auto sustituto");
		vd.setClave("asus");
		vd.setDeducible("si");
		vd.setMonto(1500);
		sust1.add(vd);
		vd = new CoberturaVO();
		vd.setClave("dmllr");
		vd.setDeducible("20");
		vd.setNombre("Daños materiales de llantas o rines");
		vd.setMonto(1500);
		sust1.add(vd);
		vd = new CoberturaVO();
		vd.setClave("agencia");
		vd.setDeducible("si");
		vd.setNombre("Siempre en agencia");
		vd.setMonto(1500);
		sust1.add(vd);
		
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
		
		Random random = new Random();
		int value = random.nextInt(2 + 0) + 0;
		for(int i=0; i<=value;i++) {
			CoberturaVO vd2 = new CoberturaVO();
			vd2 = sust1.get(i);
			listaResp2.add(vd2);
		}
		
		Double montoTotal = 0D;
		List <CoberturaVO>listaMonto = new ArrayList<>();
		listaMonto.addAll(listaResp);
		listaMonto.addAll(listaResp2);
		for(CoberturaVO voC:listaMonto) {
			montoTotal = montoTotal + voC.getMonto();
		}
		
		consultaVehiculoPaquetesResponseVO.setCobertura(listaResp);
		consultaVehiculoPaquetesResponseVO.setAdicional(listaResp2);
		consultaVehiculoPaquetesResponseVO.setPrimaFinal(montoTotal);
		return consultaVehiculoPaquetesResponseVO;
	}
	
//	private ConsultaVehiculoPaquetesResponse getVehiculoPaquetesSt (ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
//		consultaVehiculoPaquetesResponseSt = new ConsultaVehiculoPaquetesResponse();
//		consultaVehiculoPaquetesResponseSt.getVehiculoDetalle().clear();
//		List <VehiculoDetalle>listaResp = this.obtieneCoberturasSt(consultaVehiculoPaquetesRequest.getVehiculo().getTipoPaquete());
//		consultaVehiculoPaquetesResponseSt.getVehiculoDetalle().addAll(listaResp);
//		consultaVehiculoPaquetesResponseSt.setClavemarca(consultaVehiculoPaquetesRequest.getVehiculo().getClavemarca());
//		consultaVehiculoPaquetesResponseSt.setDescripcion(consultaVehiculoPaquetesRequest.getVehiculo().getDescripcion());
//		consultaVehiculoPaquetesResponseSt.setModelo(consultaVehiculoPaquetesRequest.getVehiculo().getModelo());
//		return consultaVehiculoPaquetesResponseSt;
//	}
	
	private ConsultaVehiculoPaquetesResponse obtieneCoberturasSt(String tipoPaquete) {
		ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetesResponse = new ConsultaVehiculoPaquetesResponse();
		List <Cobertura>lista1 = new ArrayList<>();
		List <Cobertura>lista2 = new ArrayList<>();
		List <Cobertura>lista3 = new ArrayList<>();
		List <Cobertura>lista4 = new ArrayList<>();
		List <Cobertura>sust1 = new ArrayList<>();
		List <Cobertura>listaResp = new ArrayList<>();
		List <Cobertura>listaResp2 = new ArrayList<>();
		Cobertura vd = new Cobertura();
		vd.setClave("cris");
		vd.setDeducible("3");
		vd.setNombre("Cristales");
		lista1.add(vd);
		vd = new Cobertura();
		vd.setClave("av");
		vd.setDeducible("3");
		vd.setNombre("Asistencia vial");
		lista1.add(vd);
		vd = new Cobertura();
		vd.setClave("aj");
		vd.setDeducible("3");
		vd.setNombre("Asistencia Juridica");
		vd.setMonto(2000);
		lista2.add(vd);
		vd = new Cobertura();
		vd.setClave("rc");
		vd.setDeducible("3");
		vd.setNombre("Responsabilidad Catastrofica");
		vd.setMonto(2000);
		lista2.add(vd);
		vd = new Cobertura();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Parcial");
		vd.setMonto(2500);
		lista3.add(vd);
		vd = new Cobertura();
		vd.setClave("dmpt");
		vd.setDeducible("3");
		vd.setNombre("Daños Materiales Pérdida Total");
		vd.setMonto(2500);
		lista4.add(vd);
		vd = new Cobertura();
		vd.setClave("rt");
		vd.setDeducible("3");
		vd.setNombre("Robo total");
		vd.setMonto(1500);
		lista4.add(vd);
		
		vd = new Cobertura();
		vd.setNombre("Auto sustituto");
		vd.setClave("asus");
		vd.setDeducible("si");
		vd.setMonto(1500);
		sust1.add(vd);
		vd = new Cobertura();
		vd.setClave("dmllr");
		vd.setDeducible("20");
		vd.setNombre("Daños materiales de llantas o rines");
		vd.setMonto(1500);
		sust1.add(vd);
		vd = new Cobertura();
		vd.setClave("agencia");
		vd.setDeducible("si");
		vd.setNombre("Siempre en agencia");
		vd.setMonto(1500);
		sust1.add(vd);
		
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
		
		
		Random random = new Random();
		int value = random.nextInt(2 + 0) + 0;
		for(int i=0; i<=value;i++) {
			Cobertura vd2 = new Cobertura();
			vd2 = sust1.get(i);
			listaResp2.add(vd2);
		}
		consultaVehiculoPaquetesResponse.getCobertura().clear();
		consultaVehiculoPaquetesResponse.getAdicional().clear();
		consultaVehiculoPaquetesResponse.getCobertura().addAll(listaResp);
		consultaVehiculoPaquetesResponse.getAdicional().addAll(listaResp2);
		
		return consultaVehiculoPaquetesResponse;
	}
	
}
