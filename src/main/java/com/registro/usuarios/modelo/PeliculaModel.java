package com.registro.usuarios.modelo;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pelicula")

public class PeliculaModel {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include()
      
    private Long pel_id;
    private String pel_titulo;
    private String pel_imagen;
    private Date pel_fecha;
    private int pel_calif;
    private Boolean is_serie;
    private Long gen_id;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "pelicula_personaje",
            joinColumns = @JoinColumn(name = "pel_id"),
            inverseJoinColumns = @JoinColumn(name = "per_id")
    )
    private List<PersonajeModel> personajes = new ArrayList<>();

    public PeliculaModel(Long pel_id, String pel_titulo, String pel_imagen, Date pel_fecha, int pel_calif,
            Boolean is_serie, Long gen_id, List<PersonajeModel> personajes) {
        this.pel_id = pel_id;
        this.pel_titulo = pel_titulo;
        this.pel_imagen = pel_imagen;
        this.pel_fecha = pel_fecha;
        this.pel_calif = pel_calif;
        this.is_serie = is_serie;
        this.gen_id = gen_id;
        this.personajes = personajes;
    }
    public void addPersonaje(PersonajeModel personaje) {
        personajes.add(personaje);
        personaje.getPeliculas().add(this);
    }
    public void removePersonaje(PersonajeModel personaje) {
        personajes.remove(personaje);
        personaje.getPeliculas().remove(this);
    }


}

