package com.registro.usuarios.repositorio;


import com.registro.usuarios.modelo.PeliculaModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PeliculaRepository extends CrudRepository<PeliculaModel, Long> {
   }
