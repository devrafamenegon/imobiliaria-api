package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MANUTENCAO")
public class Manutencao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MANUTENCAO_IMOVEL", nullable = false)
    private Long id;

    @Column(name = "DATA_MANUTENCAO_IMOVEL", nullable = false)
    private LocalDate data;

    @Column(name = "TIPO_MANUTENCAO_IMOVEL", nullable = false,  length=50)
    private String tipo;

    @Column(name = "RESPONSAVEL_MANUTENCAO_IMOVEL", nullable = false, length=50)
    private String responsavel;

    @Column(name = "CUSTO_MANUTENCAO_IMOVEL", nullable = false)
    private double custo;

    @Column(name = "OBSERVACOES_MANUTENCAO_IMOVEL", nullable = true, length=100)
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "ID_IMOVEL", nullable = false)
    private Imovel imovel;
}

