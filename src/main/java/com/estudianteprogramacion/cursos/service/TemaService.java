package com.estudianteprogramacion.cursos.service;

import com.estudianteprogramacion.cursos.model.Tema;
import com.estudianteprogramacion.cursos.repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository temaRepo;

    @Override
    public void crearTema(Tema tema) {
        temaRepo.save(tema);
    }

    @Override
    public void editarTema(Tema tema) {
        this.crearTema(tema);
    }
}
