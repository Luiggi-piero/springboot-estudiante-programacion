package com.estudianteprogramacion.cursos.repository;

import com.estudianteprogramacion.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByNombreContaining(String keyword);
}
