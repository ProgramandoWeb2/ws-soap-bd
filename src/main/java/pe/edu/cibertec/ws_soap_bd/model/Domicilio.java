package pe.edu.cibertec.ws_soap_bd.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddomicilio;
    private String descdomicilio;
    private Integer nrodomicilio;
    private String refdomicilio;
}
