package com.estudianteprogramacion.cursos.controller;

import com.estudianteprogramacion.cursos.dto.CursoTemaDTO;
import com.estudianteprogramacion.cursos.model.Curso;
import com.estudianteprogramacion.cursos.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService cursoServ;

    @PostMapping("/cursos/crear")
    public String crearCurso(@RequestBody Curso curso){
        cursoServ.crearCurso(curso);
        return "Curso creado con éxito";
    }

    @GetMapping("/cursos")
    public List<Curso> obtenerCursos(){
        return cursoServ.obtenerCursos();
    }

    @GetMapping("/cursos/temas/{idCurso}")
    public CursoTemaDTO obtenerTemasDeCurso(@PathVariable Long idCurso){
        return cursoServ.obtenerTemasDelCurso(idCurso);
    }

    @GetMapping("/cursos/{palabra}")
    public List<Curso> obtenerCursosPorPalabra(@PathVariable String palabra){
        return cursoServ.obtenerCursosPorPalabra(palabra);
    }

    @PutMapping("/cursos")
    public String editarCurso(@RequestBody Curso curso){
        cursoServ.editarCurso(curso);
        return "Curso editado con éxito";
    }
}
