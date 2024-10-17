package pe.edu.cibertec.ws_soap_bd.service;

import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws_soap_bd.model.Domicilio;

import java.util.List;

public interface IDomicilioService {

    GetDomiciliosResponse listarDomicilios();

    GetDomicilioResponse obtenerDomicilioxId(Integer id);

    PostDomicilioResponse registrarDomicilio(PostDomicilioRequest request);
}
