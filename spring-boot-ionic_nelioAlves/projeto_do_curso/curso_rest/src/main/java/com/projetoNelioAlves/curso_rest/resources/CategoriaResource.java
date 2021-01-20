package com.projetoNelioAlves.curso_rest.resources;

import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public String teste(){
        return "correu tudo bem por aqui!!";
    }
}
