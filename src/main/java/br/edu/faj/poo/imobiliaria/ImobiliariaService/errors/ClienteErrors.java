package br.edu.faj.poo.imobiliaria.ImobiliariaService.errors;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteErrors {
    @Autowired
    static MessageUtil messageUtil;

    public static class ClienteAlreadyExistsException extends RuntimeException {
        public ClienteAlreadyExistsException() {
            super("Cliente já existe.");
        }
    }

    public static class ClienteNotExistsException extends RuntimeException {
        public ClienteNotExistsException() {
            super("Cliente não existe.");
        }
    }

    public static class InvalidCredentialsException extends RuntimeException {
        public InvalidCredentialsException() {
            super("Credenciais inválidas.");
        }
    }
}
