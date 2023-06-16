package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterClienteDTO {
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private LocalDate dataNascimento;
    private String senha;
}
