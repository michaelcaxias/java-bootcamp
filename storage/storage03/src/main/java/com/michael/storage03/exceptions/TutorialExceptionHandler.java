package com.michael.storage03.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class TutorialExceptionHandler {

    @ExceptionHandler(InvalidParamException.class)
    public ResponseEntity<ExceptionDetails> handlerInvalidParamException(InvalidParamException exception) {
        ExceptionDetails exceptionDetails = ExceptionDetails
                .builder()
                .title("Parâmetro inválido")
                .message(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
}
