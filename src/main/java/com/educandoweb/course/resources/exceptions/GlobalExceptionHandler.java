package com.educandoweb.course.resources.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	// Captura especificamente o erro de registro não encontrado no banco
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex) {
        
        // Criando um corpo JSON bonito para a resposta (opcional)
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", HttpStatus.NOT_FOUND.value());
        body.put("error", "Not Found");
        body.put("message", "Id not found");

        // Retorna o JSON com o status HTTP 404
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
    
    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<Object> database(DatabaseException ex) {
        
        // Criando um corpo JSON bonito para a resposta (opcional)
        Map<String, Object> body = new HashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("status", HttpStatus.BAD_REQUEST.value());
        body.put("error", "Not Found");
        body.put("message", "Database Error");

        // Retorna o JSON com o status HTTP 404
        return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
    }
    
    
}