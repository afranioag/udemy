package com.projetoNelioAlves.curso_rest.service;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import com.projetoNelioAlves.curso_rest.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService() {

    }

    public Categoria buscar(long id){
       Categoria cate = categoriaRepository.getOne(id);

        return cate;
    }

}
