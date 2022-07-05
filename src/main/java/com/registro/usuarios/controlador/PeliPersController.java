package com.registro.usuarios.controlador;
/* 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.registro.usuarios.modelo.PeliPersModel;
import com.registro.usuarios.servicio.PeliPersService;
import lombok.var;


@RestController
    @RequestMapping("/pelipers")
        public class PeliPersController {
    
        @Autowired
        PeliPersService peliPersService;

        @PostMapping()
        public ResponseEntity<PeliPersModel> savePelicula(@RequestBody PeliPersModel pelpers) {
            var pelipersSaved = peliPersService.save(pelpers);
            return new ResponseEntity<>(pelipersSaved, HttpStatus.OK);
        }


        @PatchMapping("/deletepelipers/{pelid}/{perid}")
        public ResponseEntity<Void> deleteByidID(@PathVariable("pelid") Long pel_id, @PathVariable("perid") Long per_id ) {
            this.peliPersService.DeleteByIdiid(pel_id, per_id);
            return ResponseEntity.noContent().build();
        }     

}
*/