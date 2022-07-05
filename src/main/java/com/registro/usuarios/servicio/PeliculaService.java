package com.registro.usuarios.servicio;


import com.registro.usuarios.modelo.PeliculaModel;
import com.registro.usuarios.repositorio.PeliculaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PeliculaService {

    private final PeliculaRepository peliculaRepository;

        public List<PeliculaModel> findAll() {
            return (List<PeliculaModel>) peliculaRepository.findAll();
    }

    public PeliculaModel findById(final Long id) {
        return peliculaRepository.findById(id).orElseThrow();
    }

    public PeliculaModel save (final PeliculaModel pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public void delete(final PeliculaModel pelicula) {
        peliculaRepository.delete(pelicula);
    }
}
