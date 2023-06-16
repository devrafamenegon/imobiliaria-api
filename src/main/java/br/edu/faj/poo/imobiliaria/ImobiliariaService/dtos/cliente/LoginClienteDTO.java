package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginClienteDTO {
    private String email;
    private String senha;
}
