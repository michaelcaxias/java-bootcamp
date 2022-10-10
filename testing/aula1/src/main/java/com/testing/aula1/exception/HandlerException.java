package com.testing.aula1.exception;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders httpHeaders,
            HttpStatus httpStatus,
            WebRequest webRequest) {

        List<FieldError> errors = ex.getBindingResult().getFieldErrors();
        String errorsField = errors.stream().map(FieldError::getField).collect(Collectors.joining());
        String errorsFieldMessages = errors.stream().map(FieldError::getDefaultMessage).collect(Collectors.joining());
        

        ExceptionDetails exceptionDetails = ExceptionDetails.builder()
                .message("Os campos estão inválidos")
                .fields(errorsField)
                .fieldsMessages(errorsFieldMessages)
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(exceptionDetails, httpStatus);
    }
}
