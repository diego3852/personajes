package com.registro.usuarios.controlador;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registro.usuarios.modelo.PersonajeModel;
import com.registro.usuarios.servicio.PersonajeService;
    
    @RestController
    @RequestMapping("/personaje")
    public class PersonajeController {
        @Autowired
        PersonajeService personajeService;
    
        @GetMapping()
        public ArrayList<PersonajeModel> obtenerPersonajes(){
            return personajeService.obtenerPersonajes();
        }
        
        @PostMapping()
        public PersonajeModel guardarPersonaje(@RequestBody PersonajeModel personaje){
            return this.personajeService.guardarPersonaje(personaje);
        }
    
}
    