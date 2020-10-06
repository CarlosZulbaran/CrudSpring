package mx.com.gm.mx.com.gm.servicio;

import java.util.List;

import mx.com.gm.mx.com.gm.domain.Persona;

public interface PersonaService {
    public List<Persona> ListarPersonas();
    public void guardar (Persona persona);
    public void eliminar (Persona persona);
    public Persona encontrarPersona (Persona persona);
}