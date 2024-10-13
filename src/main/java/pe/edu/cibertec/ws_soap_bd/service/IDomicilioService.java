package pe.edu.cibertec.ws_soap_bd.service;

import pe.edu.cibertec.ws_soap_bd.model.Domicilio;

import java.util.List;

public interface IDomicilioService {

    List<Domicilio> listarDomicilios();

    Domicilio obtenerDomicilioxId(Integer id);

    Domicilio registrarDomicilio(Domicilio domicilio);
}
