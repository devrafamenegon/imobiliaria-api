package br.edu.faj.poo.imobiliaria.ImobiliariaService.controllers;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.Response;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente.LoginClienteDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente.RegisterClienteDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Cliente;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.errors.ClienteErrors;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.errors.ExceptionHandlerController;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.services.ClienteService;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService clienteService;

    @Autowired
    MessageUtil messageUtil;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody RegisterClienteDTO cliente) {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.clienteRegisterSuccessMessage, clienteService.register(cliente)));
        } catch (Exception e) {
            if (e instanceof ClienteErrors.ClienteAlreadyExistsException) {
                return ResponseEntity.badRequest().body(Response.error(e.getMessage(), null));
            }

            return ExceptionHandlerController.handleException(e);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginClienteDTO cliente) {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.clienteLoginSuccessMessage, clienteService.login(cliente)));
        } catch (Exception e) {
            if (e instanceof ClienteErrors.InvalidCredentialsException) {
                return ResponseEntity.badRequest().body(Response.error(e.getMessage(), null));
            }

            return ExceptionHandlerController.handleException(e);
        }
    }
}
