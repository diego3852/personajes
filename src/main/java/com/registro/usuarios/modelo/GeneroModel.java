package com.registro.usuarios.modelo;

import javax.persistence.*;

@Entity
@Table(name = "genero")

public class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long gen_id;
    private String gen_nombre;
    private String gen_imagen;
    public Long getGen_id() {
        return gen_id;
    }
    public void setGen_id(Long gen_id) {
        this.gen_id = gen_id;
    }
    public String getGen_nombre() {
        return gen_nombre;
    }
    public void setGen_nombre(String gen_nombre) {
        this.gen_nombre = gen_nombre;
    }
    public String getGen_imagen() {
        return gen_imagen;
    }
    public void setGen_imagen(String gen_imagen) {
        this.gen_imagen = gen_imagen;
    }
    public GeneroModel(Long gen_id, String gen_nombre, String gen_imagen) {
        this.gen_id = gen_id;
        this.gen_nombre = gen_nombre;
        this.gen_imagen = gen_imagen;
    }
    public GeneroModel(String gen_nombre, String gen_imagen) {
        this.gen_nombre = gen_nombre;
        this.gen_imagen = gen_imagen;
    }
    public GeneroModel() {
    }



    
}



