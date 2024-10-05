package com.estudianteprogramacion.cursos.service;

import com.estudianteprogramacion.cursos.dto.CursoTemaDTO;
import com.estudianteprogramacion.cursos.model.Curso;
import com.estudianteprogramacion.cursos.model.Tema;
import com.estudianteprogramacion.cursos.repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private ICursoRepository cursoRepo;

    @Override
    public void crearCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> obtenerCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public CursoTemaDTO obtenerTemasDelCurso(Long idCurso) {
        Curso cur = cursoRepo.findById(idCurso).orElse(null);
        CursoTemaDTO cursoTemaDTO = new CursoTemaDTO();
        cursoTemaDTO.setNombreCurso(cur.getNombre());
        cursoTemaDTO.setListaTemas(cur.getListaDeTemas());

        return cursoTemaDTO;
    }

    @Override
    public List<Curso> obtenerCursosPorPalabra(String palabra) {
        List<Curso> cursos = cursoRepo.findByNombreContaining(palabra);
        return cursos;
    }

    @Override
    public void editarCurso(Curso curso) {
        this.crearCurso(curso);
    }
}
