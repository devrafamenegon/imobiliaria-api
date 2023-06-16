package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.dependencia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DependenciaDTO {
    private Long id;
    private String nome;
    private String tipo;
    private double area;
    private boolean mobilia;
    private Long imovelId;
}
