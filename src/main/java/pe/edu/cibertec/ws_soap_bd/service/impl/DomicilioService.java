package pe.edu.cibertec.ws_soap_bd.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_soap_bd.model.Domicilio;
import pe.edu.cibertec.ws_soap_bd.repository.DomicilioRepository;
import pe.edu.cibertec.ws_soap_bd.service.IDomicilioService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService {

    private final DomicilioRepository domicilioRepository;

    @Override
    public List<Domicilio> listarDomicilios() {
        return domicilioRepository.findAll();
    }

    @Override
    public Domicilio obtenerDomicilioxId(Integer id) {
        return domicilioRepository.findById(id).orElse(null);
    }

    @Override
    public Domicilio registrarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
}
