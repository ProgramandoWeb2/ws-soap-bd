package pe.edu.cibertec.ws_soap_bd.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Domiciliows;
import pe.edu.cibertec.ws_soap_bd.model.Domicilio;

import java.util.ArrayList;
import java.util.List;

@Component
public class DomicilioConvert {

    public Domicilio mapToDomicilio(Domiciliows domiciliows){
        return  Domicilio.builder()
                .iddomicilio(domiciliows.getIddomicilio())
                .descdomicilio(domiciliows.getDescdomicilio())
                .nrodomicilio(domiciliows.getNrodomicilio())
                .refdomicilio(domiciliows.getRefdomicilio()).build();
    }
    public Domiciliows mapToDomiciliows(Domicilio domicilio){
        Domiciliows domiciliows = new Domiciliows();
        domiciliows.setIddomicilio(domicilio.getIddomicilio());
        domiciliows.setDescdomicilio(domicilio.getDescdomicilio());
        domiciliows.setNrodomicilio(domicilio.getNrodomicilio());
        domiciliows.setRefdomicilio(domicilio.getRefdomicilio());
        return domiciliows;
    }

    public List<Domicilio> mapToDomicilioList(List<Domiciliows> domiciliowsList){
        List<Domicilio> domicilioList = new ArrayList<>();
        for (Domiciliows domiciliows : domiciliowsList){
            domicilioList.add(mapToDomicilio(domiciliows));
        }
        return domicilioList;
    }

    public List<Domiciliows> mapToDomiciliowsList(List<Domicilio> domicilioList){
        List<Domiciliows> domiciliowsList = new ArrayList<>();
        for (Domicilio domicilio : domicilioList){
            domiciliowsList.add(mapToDomiciliows(domicilio));
        }
        return domiciliowsList;
    }


}
