package com.mongod.workshopmongo.services.exception;

public class ObjectNotFoundExeception extends RuntimeException {
    private static final long serialVersionUID =1L;

    public ObjectNotFoundExeception(String msg) {
        super(msg);
    }
}
