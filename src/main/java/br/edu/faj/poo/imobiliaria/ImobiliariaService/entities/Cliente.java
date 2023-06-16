package br.edu.faj.poo.imobiliaria.ImobiliariaService.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENTE")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE", nullable = false)
    private Long id;

    @Column(name = "CPF_CLIENTE", nullable = false, length=11, unique = true)
    private String cpf;

    @Column(name = "NOME_CLIENTE", nullable = false, length=50)
    private String nome;

    @Column(name = "TELEFONE_CLIENTE", nullable = false, length=14)
    private String telefone;

    @Column(name = "EMAIL_CLIENTE", nullable = false, length=50, unique = true)
    private String email;

    @Column(name = "DATA_NASCIMENTO_CLIENTE", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "SENHA_CLIENTE", nullable = false, length=20)
    private String senha;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proprietario")
    private List<Imovel> imoveis;
}

