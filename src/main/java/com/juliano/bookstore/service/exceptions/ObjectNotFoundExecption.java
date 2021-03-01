package com.juliano.bookstore.service.exceptions;
public class ObjectNotFoundExecption extends RuntimeException {

    private static final long serialVersionUID = 1L;
    

    public ObjectNotFoundExecption(String message,Throwable cause) {
        super(message,cause);
    }
    public ObjectNotFoundExecption(String message){
        super(message);
    }



}