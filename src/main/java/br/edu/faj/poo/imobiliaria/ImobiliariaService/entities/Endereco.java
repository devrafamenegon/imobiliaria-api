package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO_IMOVEL", nullable = false)
    private Long id;

    @Column(name = "CEP_ENDERECO_IMOVEL", nullable = false, length=9)
    private String cep;

    @Column(name = "LOGRADOURO_ENDERECO_IMOVEL", nullable = false, length=50)
    private String logradouro;

    @Column(name = "NUMERO_ENDERECO_IMOVEL", nullable = false, length=5)
    private String numero;

    @Column(name = "COMPLEMENTO_ENDERECO_IMOVEL", nullable = true, length=50)
    private String complemento;

    @Column(name = "BAIRRO_ENDERECO_IMOVEL", nullable = false, length=25)
    private String bairro;

    @Column(name = "CIDADE_ENDERECO_IMOVEL", nullable = false, length=50)
    private String cidade;

    @Column(name = "UF_ENDERECO_IMOVEL", nullable = false, length=2)
    private String uf;
}