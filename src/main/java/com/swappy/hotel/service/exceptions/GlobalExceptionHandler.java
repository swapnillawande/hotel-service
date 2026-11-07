package com.swappy.hotel.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.swappy.hotel.service.exceptions.ResourceNotFoundException;
import com.swappy.hotel.service.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {

        String message = ex.getMessage();

        ApiResponse apiResponse = new ApiResponse(message, false, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
    }
}