package com.registro.usuarios.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.registro.usuarios.modelo.PeliculaModel;
import com.registro.usuarios.servicio.PeliculaService;

import lombok.var;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    PeliculaService peliculaService;
 
    @GetMapping
    public ResponseEntity<List<PeliculaModel>> getPeliculas() {
        var peliculas = peliculaService.findAll();
        return new ResponseEntity<>(peliculas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeliculaModel> getPelicula(@PathVariable("id") Long id) {
        var pelicula = peliculaService.findById(id);
        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<PeliculaModel> savePelicula(@RequestBody PeliculaModel pelicula) {
        
        var peliculaSaved = peliculaService.save(pelicula);

        return new ResponseEntity<>(peliculaSaved, HttpStatus.OK);
    }

    @DeleteMapping()
    public ResponseEntity<PeliculaModel> deletePelicula(@RequestBody PeliculaModel pelicula) {
        peliculaService.delete(pelicula);
        return new ResponseEntity<>(pelicula, HttpStatus.OK);
    }

}
