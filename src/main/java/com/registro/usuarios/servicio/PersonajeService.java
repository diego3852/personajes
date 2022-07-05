package com.registro.usuarios.servicio;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.registro.usuarios.modelo.PersonajeModel;
import com.registro.usuarios.repositorio.PersonajeRepository;

@Service
public class PersonajeService {
    @Autowired
    PersonajeRepository personajeRepository;
    
    public ArrayList<PersonajeModel> obtenerPersonajes(){
       return(ArrayList<PersonajeModel>) personajeRepository.findAll();
    }

    public PersonajeModel guardarPersonaje(PersonajeModel personaje){
        return personajeRepository.save(personaje);
    }

    public void DeleteById(Long id) {
        Optional<PersonajeModel> optionalPersonajeModel = this.personajeRepository.findById(id);
        if (optionalPersonajeModel.isEmpty()) {
           // throw new ToDoExceptions( message "Personaje no enfontrado", HttpStatus.NOT_FOUND);
        }
        this.personajeRepository.deleteById(id);
    }
}


