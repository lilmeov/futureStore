package com.attractor.futureStore.advice;


import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.nio.file.FileAlreadyExistsException;


@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllKindOfException(Exception e){
        return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FileAlreadyExistsException.class)
    public ResponseEntity<String> handleAlreadyExistsException(Exception e){
        return new ResponseEntity<String>("This username already registered in database. Pls try to register with another nickname", HttpStatus.BAD_REQUEST);
    }

}
