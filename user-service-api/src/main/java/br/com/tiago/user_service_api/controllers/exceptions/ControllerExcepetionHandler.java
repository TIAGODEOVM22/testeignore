package br.com.tiago.user_service_api.controllers.exceptions;

import br.com.tiago.model.exceptions.ResourceNotFoundExceptions;
import br.com.tiago.model.exceptions.StandardError;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;

import static java.time.LocalDateTime.now;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ControllerExcepetionHandler {

    @ExceptionHandler(ResourceNotFoundExceptions.class)
    ResponseEntity<StandardError> handleNotFoundException(
            final ResourceNotFoundExceptions ex,
            final HttpServletRequest request) {

        return ResponseEntity.status(NOT_FOUND).body(
                StandardError.builder()
                        .timestamp(now())/*pega momento atual do servidor*/
                        .status(NOT_FOUND.value())/*o value retorna valor inteiro da exceção NOT_FOUND 404*/
                        .error(NOT_FOUND.getReasonPhrase())/*posso pasar apenas "resource NOT_FOUND"*/
                        .message(ex.getMessage())/*mens do objeto que foi lançado como exceção*/
                        .path(request.getRequestURI())/*qual o URI que a requisição aconteceu*/
                        .build()
        );
    }
}
