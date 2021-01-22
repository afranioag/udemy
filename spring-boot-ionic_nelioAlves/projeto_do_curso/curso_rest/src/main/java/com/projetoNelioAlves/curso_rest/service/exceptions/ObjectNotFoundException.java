package com.projetoNelioAlves.curso_rest.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1l;

    public ObjectNotFoundException(String msg){
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable causa){
        super(msg, causa);
    }
}
