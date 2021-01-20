package com.projetoNelioAlves.curso_rest.resources;

import java.util.ArrayList;
import java.util.List;
import com.projetoNelioAlves.curso_rest.domain.Categoria;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1, "informatica");
        Categoria cat2 = new Categoria(2,"escritoire");

        List<Categoria> umCu = new ArrayList<Categoria>();

        umCu.add(cat1);
        umCu.add(cat2);

        return umCu;
    }

    @GetMapping("/api")
    public String nome(){
        return "maria";
    }
}
