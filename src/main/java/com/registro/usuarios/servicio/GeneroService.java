package com.registro.usuarios.servicio;


import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.registro.usuarios.modelo.GeneroModel;
import com.registro.usuarios.repositorio.GeneroRepository;


@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

   
    public ArrayList<GeneroModel> obtenerGenero(){
       return(ArrayList<GeneroModel>) generoRepository.findAll();
    }
    public GeneroModel guardarGenero(GeneroModel genero){
        return generoRepository.save(genero);
    }

}
