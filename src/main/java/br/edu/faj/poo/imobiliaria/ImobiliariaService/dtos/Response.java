package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {
    public Status status;
    public String message;
    public Object data;

    public static Response success(String message, Object data) {
        return new Response(Status.success, message, data);
    }

    public static Response error(String message, Object data) {
        return new Response(Status.error, message, data);
    }
}
