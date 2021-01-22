package com.projetoNelioAlves.curso_rest.service;

import com.projetoNelioAlves.curso_rest.domain.Categoria;
import com.projetoNelioAlves.curso_rest.repository.CategoriaRepository;
import com.projetoNelioAlves.curso_rest.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaService() {

    }

    public Categoria buscar(Integer id){
        Optional<Categoria> categoria = categoriaRepository.findById(id);

        if(!categoria.isPresent()){
            throw new ObjectNotFoundException("Objeto com id " + id + " não encontrado");
        }
        return  categoria.get();
    }

}