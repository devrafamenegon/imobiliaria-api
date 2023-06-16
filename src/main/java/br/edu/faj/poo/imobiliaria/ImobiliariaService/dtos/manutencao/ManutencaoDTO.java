package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.manutencao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManutencaoDTO {
    private Long id;
    private LocalDate data;
    private String tipo;
    private String responsavel;
    private double custo;
    private String observacoes;
    private Long imovelId;
}
