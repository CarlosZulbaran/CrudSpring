package mx.com.gm.mx.com.gm.domain;
//MODELO VISTA CONTROLADOR
//ESTE VIENE SIENDO EL MODELO
import java.io.Serializable;

import javax.persistence.*;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.Data;

@Data
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    private static final long serialVersonaUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;

    
    private String nombre;


    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

   

}