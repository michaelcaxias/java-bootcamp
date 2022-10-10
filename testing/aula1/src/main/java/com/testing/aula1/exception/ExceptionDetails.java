package com.testing.aula1.exception;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ExceptionDetails {
    private String message;
    private String fields;
    private String fieldsMessages;
    private LocalDateTime timestamp;
}
