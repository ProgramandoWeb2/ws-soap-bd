package pe.edu.cibertec.ws_soap_bd.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.ws.objects.Moneda;
import pe.edu.cibertec.ws.objects.Pais;

import java.util.HashMap;
import java.util.Map;

@Component
public class PaisRepository {

    private static final Map<String, Pais> paises = new HashMap<>();

    @PostConstruct
    public void cargarPaises(){
        Pais uruguay = new Pais();
        uruguay.setNombre("Uruguay");
        uruguay.setCapital("Montevideo");
        uruguay.setPoblacion(1000000);
        uruguay.setMoneda(Moneda.USD);
        Pais peru = new Pais();
        peru.setNombre("Perú");
        peru.setCapital("Lima");
        peru.setMoneda(Moneda.PEN);
        peru.setPoblacion(28000000);
        Pais espania = new Pais();
        espania.setNombre("España");
        espania.setCapital("Madrid");
        espania.setMoneda(Moneda.EUR);
        espania.setPoblacion(60000000);
        paises.put(uruguay.getNombre(), uruguay);
        paises.put(peru.getNombre(), peru);
        paises.put(espania.getNombre(), espania);

    }

    public Pais buscarPaisXNombre(String nombre){
        return paises.get(nombre);
    }
}
