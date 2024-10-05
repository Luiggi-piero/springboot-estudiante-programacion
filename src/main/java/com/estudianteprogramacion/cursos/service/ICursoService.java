package com.estudianteprogramacion.cursos.service;

import com.estudianteprogramacion.cursos.dto.CursoTemaDTO;
import com.estudianteprogramacion.cursos.model.Curso;
import com.estudianteprogramacion.cursos.model.Tema;

import java.util.List;

public interface ICursoService {

    public void crearCurso(Curso curso);

    public List<Curso> obtenerCursos();

    public CursoTemaDTO obtenerTemasDelCurso(Long idCurso);

    public List<Curso> obtenerCursosPorPalabra(String palabra);

    public void editarCurso(Curso curso);
}
