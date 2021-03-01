package com.juliano.bookstore.resources.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.ServletRequest;

import com.juliano.bookstore.service.exceptions.ObjectNotFoundExecption;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectNotFoundExecption.class)
    public ResponseEntity<StandarError> ObjectNotFoundExecption(ObjectNotFoundExecption e, ServletRequest request) {
        StandarError error = new StandarError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}