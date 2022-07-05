package com.registro.usuarios.repositorio;


import com.registro.usuarios.modelo.PersonajeModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PersonajeRepository extends CrudRepository<PersonajeModel, Long> {

}
