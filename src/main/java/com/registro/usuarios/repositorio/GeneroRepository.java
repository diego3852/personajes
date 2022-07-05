package com.registro.usuarios.repositorio;

import com.registro.usuarios.modelo.GeneroModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface GeneroRepository extends CrudRepository<GeneroModel, Long> {
    
}
