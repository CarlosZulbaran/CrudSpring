package mx.com.gm.mx.com.gm.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.gm.mx.com.gm.domain.Persona;

public interface IPersonaDao extends CrudRepository<Persona,Long>{
    
    
}