package com.registro.usuarios.modelo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "personaje")
public class PersonajeModel {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include()

    private Long per_id;
    private String per_nombre;
    private String per_imagen;
    private int per_edad;
    private int per_peso;
    private String per_historia;

    @ManyToMany(mappedBy = "personajes")
    public List<PeliculaModel> peliculas = new ArrayList<>();


}
