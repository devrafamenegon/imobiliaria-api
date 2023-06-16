package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DEPENDENCIA")
public class Dependencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DEPENDENCIA_IMOVEL", nullable = false)
    private Long id;

    @Column(name = "NOME_DEPENDENCIA_IMOVEL", nullable = false, length=50)
    private String nome;

    @Column(name = "TIPO_DEPENDENCIA_IMOVEL", nullable = false, length=25)
    private String tipo;

    @Column(name = "AREA_DEPENDENCIA_IMOVEL", nullable = false)
    private double area;

    @Column(name = "MOBILIA_DEPENDENCIA_IMOVEL", nullable = false)
    private boolean mobilia;

    @ManyToOne
    @JoinColumn(name = "ID_IMOVEL", nullable = false)
    private Imovel imovel;
}

