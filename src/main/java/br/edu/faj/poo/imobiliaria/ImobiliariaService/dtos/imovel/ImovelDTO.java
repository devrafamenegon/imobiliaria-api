package br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.imovel;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.dependencia.DependenciaDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.endereco.EnderecoDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.manutencao.ManutencaoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImovelDTO {
    private Long id;
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
    private EnderecoDTO endereco;
    private List<DependenciaDTO> dependencias;
    private List<ManutencaoDTO> manutencoes;
}
