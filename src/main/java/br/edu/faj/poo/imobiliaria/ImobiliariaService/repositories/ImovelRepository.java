package br.edu.faj.poo.imobiliaria.ImobiliariaService.repositories;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {

}

