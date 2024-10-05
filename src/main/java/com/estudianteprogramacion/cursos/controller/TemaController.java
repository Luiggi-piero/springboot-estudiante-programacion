package com.estudianteprogramacion.cursos.controller;

import com.estudianteprogramacion.cursos.model.Tema;
import com.estudianteprogramacion.cursos.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {

    @Autowired
    private ITemaService temaServ;

    @PostMapping("/temas/crear")
    public String crearTema(@RequestBody Tema tema){
        temaServ.crearTema(tema);
        return "Tema creado con éxito";
    }

    @PutMapping("/tema/editar")
    public String editarTema(@RequestBody Tema tema){
        temaServ.editarTema(tema);
        return "Tema editado con éxito";
    }
}
