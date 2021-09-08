package com.mx.marsh.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesRequest;
import com.marsh.paquetedetalle.ConsultaVehiculoPaquetesResponse;
import com.mx.marsh.service.ConsultaPaquetesService;

@Endpoint
public class ConsultaPaquetesEndpoint {

	@Autowired
	private ConsultaPaquetesService service;
	
	@PayloadRoot(namespace = "http://marsh.com/paqueteDetalle", localPart = "consultaVehiculoPaquetesRequest")
	@ResponsePayload
	public ConsultaVehiculoPaquetesResponse consultaVehiculoPaquetes (@RequestPayload ConsultaVehiculoPaquetesRequest consultaVehiculoPaquetesRequest) {
		ConsultaVehiculoPaquetesResponse response = new ConsultaVehiculoPaquetesResponse();
		response = service.consultaVehiculoPaquetes(consultaVehiculoPaquetesRequest);
		return response;
	}
}
