package com.attractor.futureStore.advice;


import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.nio.file.FileAlreadyExistsException;
import java.rmi.NoSuchObjectException;


@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleAllKindOfException(Exception e){
        return new ResponseEntity<String>("Something went wrong", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(FileAlreadyExistsException.class)
    public ResponseEntity<String> handleAlreadyExistsException(Exception e){
        return new ResponseEntity<String>("This username is already registered in database. Pls try to register with another nickname", HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(NoSuchObjectException.class)
//    public ResponseEntity<String> handleNoSuchObjectException(Exception e){
//        return new ResponseEntity<String>("No such user. U should regis", HttpStatus.BAD_REQUEST);
//    }

}
