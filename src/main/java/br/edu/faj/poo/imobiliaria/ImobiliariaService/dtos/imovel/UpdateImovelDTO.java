package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.imovel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateImovelDTO {
    private boolean status;
    private double valorCompra;
    private double valorAluguel;
    private boolean permuta;
    private boolean aceitaAnimais;
    private String tipoDeImovel;
    private char finalidade;
    private double area;
    private double areaConstruida;
    private Long funcionarioId;
    private Long proprietarioId;
}
