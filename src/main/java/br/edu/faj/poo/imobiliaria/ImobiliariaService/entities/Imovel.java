package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "IMOVEL")
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMOVEL", nullable = false)
    private Long id;

    @Column(name = "STATUS_IMOVEL", nullable = false)
    private boolean status;

    @Column(name = "VALOR_COMPRA_IMOVEL", nullable = false)
    private double valorCompra;

    @Column(name = "VALOR_ALUGUEL_IMOVEL", nullable = false)
    private double valorAluguel;

    @Column(name = "PERMUTA_IMOVEL", nullable = false)
    private boolean permuta;

    @Column(name = "ACEITA_ANIMAIS_IMOVEL", nullable = false)
    private boolean aceitaAnimais;

    @Column(name = "TIPO_IMOVEL", nullable = false, length=50)
    private String tipoDeImovel;

    @Column(name = "FINALIDADE_IMOVEL", nullable = false)
    private char finalidade;

    @Column(name = "AREA_IMOVEL", nullable = false)
    private double area;

    @Column(name = "AREA_CONSTRUIDA_IMOVEL", nullable = false)
    private double areaConstruida;

    @ManyToOne
    @JoinColumn(name = "ID_FUNCIONARIO", nullable = true)
    private Funcionario funcionario;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente proprietario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_ENDERECO_IMOVEL")
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imovel")
    private List<Dependencia> dependencias;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "imovel")
    private List<Manutencao> manutencoes;
}