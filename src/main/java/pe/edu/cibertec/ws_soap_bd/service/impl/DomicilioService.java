package pe.edu.cibertec.ws_soap_bd.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws.objects.GetDomicilioResponse;
import pe.edu.cibertec.ws.objects.GetDomiciliosResponse;
import pe.edu.cibertec.ws.objects.PostDomicilioRequest;
import pe.edu.cibertec.ws.objects.PostDomicilioResponse;
import pe.edu.cibertec.ws_soap_bd.exception.NotFoundException;
import pe.edu.cibertec.ws_soap_bd.model.Domicilio;
import pe.edu.cibertec.ws_soap_bd.repository.DomicilioRepository;
import pe.edu.cibertec.ws_soap_bd.service.IDomicilioService;
import pe.edu.cibertec.ws_soap_bd.util.convert.DomicilioConvert;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService {

    private final DomicilioRepository domicilioRepository;
    private final DomicilioConvert domicilioConvert;


    @Override
    public GetDomiciliosResponse listarDomicilios() {
        GetDomiciliosResponse getDomiciliosResponse = new GetDomiciliosResponse();
        getDomiciliosResponse.getDomicilios().addAll(
                domicilioConvert.mapToDomiciliowsList(domicilioRepository.findAll())
        );
        return getDomiciliosResponse;
    }

    @Override
    public GetDomicilioResponse obtenerDomicilioxId(Integer id) {
        GetDomicilioResponse domicilioResponse = new GetDomicilioResponse();
        Domicilio domicilio = domicilioRepository.findById(id).orElse(null);
        if(domicilio == null){
            throw  new NotFoundException("El domicilio con ID "+ id+" no existe.");
        }
        domicilioResponse.setDomicilio(
                domicilioConvert.mapToDomiciliows(domicilio));
        return domicilioResponse;
    }

    @Override
    public PostDomicilioResponse registrarDomicilio(PostDomicilioRequest request) {
        PostDomicilioResponse postDomicilioResponse = new PostDomicilioResponse();
        Domicilio nuevoDomicilio = domicilioRepository.save(
                domicilioConvert.mapToDomicilio(request.getDomicilio())
        );
        postDomicilioResponse.setDomicilio(
                domicilioConvert.mapToDomiciliows(nuevoDomicilio));
        return postDomicilioResponse;
    }
}
