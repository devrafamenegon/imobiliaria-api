package br.edu.faj.poo.imobiliaria.ImobiliariaService.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class MessageUtil {
    @Value("${message.imovel.create.success}")
    public String imovelCreateSuccessMessage;

    @Value("${message.imovel.getMany.success}")
    public String imovelGetManySuccessMessage;

    @Value("${message.imovel.getOne.success}")
    public String imovelGetOneSuccessMessage;

    @Value("${message.imovel.update.success}")
    public String imovelUpdateSuccessMessage;

    @Value("${message.imovel.delete.success}")
    public String imovelDeleteSuccessMessage;

    @Value("${message.cliente.register.success}")
    public String clienteRegisterSuccessMessage;

    @Value("${message.cliente.register.error}")
    public String clienteRegisterErrorMessage;

    @Value("${message.cliente.login.success}")
    public String clienteLoginSuccessMessage;

    @Value("${message.cliente.login.error}")
    public String clienteLoginErrorMessage;

    @Value("${message.cliente.errors.invalidCredentials}")
    public String clienteInvalidCredentialsMessage;

    @Value("${message.error.unexpected}")
    public String unexpectedErrorMessage;
}
