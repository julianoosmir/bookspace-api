package com.juliano.bookstore.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

import com.juliano.bookstore.service.exceptions.DataIntegrityViolationException;
import com.juliano.bookstore.service.exceptions.ObjectNotFoundExecption;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundExecption.class)
    public ResponseEntity<StandarError> objectNotFoundExecption(ObjectNotFoundExecption e, ServletRequest request) {
        StandarError error = new StandarError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandarError> dataIntegrityViolationException(DataIntegrityViolationException e, ServletRequest request) {
        StandarError error = new StandarError(System.currentTimeMillis(), HttpStatus.BAD_REQUEST.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
}   