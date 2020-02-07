package mobileappws.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import mobileappws.constants.MessagesPortuguese;
import mobileappws.response.ErrorMessage;

/**
 * AppExceptionHandler
 * 
 * Classe responsável por centralizar o tratamento de exceções na aplicação
 */
@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

        /* Creating an returned object of type ErrorMessage */
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setUserFriendlyMessage(MessagesPortuguese.GENERAL_SYSTEM_ERROR);
        errorMessage.setErrorDetails(ex.getLocalizedMessage());
        errorMessage.setTimeStamp(new Date());
        errorMessage.setExceptionType(ex.getClass().getName());

        return new ResponseEntity<>(ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request) {

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setUserFriendlyMessage(MessagesPortuguese.CODE_SYSTEM_ERROR);
        errorMessage.setErrorDetails(ex.getLocalizedMessage());
        errorMessage.setTimeStamp(new Date());
        errorMessage.setExceptionType(ex.getClass().getName());

        return new ResponseEntity<>(ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }  
}