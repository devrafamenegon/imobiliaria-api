package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "FUNCIONARIO")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FUNCIONARIO", nullable = false)
    private Long id;

    @Column(name = "MATRICULA_FUNCIONARIO", nullable = false, unique = true)
    private Long matricula;

    @Column(name = "NOME_FUNCIONARIO", nullable = false, length=50)
    private String nome;

    @Column(name = "TELEFONE_FUNCIONARIO", nullable = false, length=20)
    private String telefone;

    @Column(name = "EMAIL_FUNCIONARIO", nullable = false, length=50, unique = true)
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "funcionario")
    private List<Imovel> imoveis;
}
