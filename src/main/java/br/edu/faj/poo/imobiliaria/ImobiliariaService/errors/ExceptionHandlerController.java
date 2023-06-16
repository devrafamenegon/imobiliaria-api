package br.edu.faj.poo.imobiliaria.ImobiliariaService.errors;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.Response;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @Autowired
    private static MessageUtil messageUtil;

    @ExceptionHandler(Exception.class)
    public static ResponseEntity<Response> handleException(Exception e) {
        System.out.println(e.getMessage());
        return ResponseEntity.internalServerError().body(Response.error(messageUtil.unexpectedErrorMessage, null));
    }
}