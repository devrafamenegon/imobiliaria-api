package br.edu.faj.poo.imobiliaria.ImobiliariaService.services;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.imovel.CreateImovelDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Imovel;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.repositories.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    @Autowired
    ImovelRepository imovelRepository;

    public Imovel create(CreateImovelDTO imovel) {
        Imovel newImovel = new Imovel();
        newImovel.setStatus(imovel.isStatus());
        newImovel.setValorCompra(imovel.getValorCompra());
        newImovel.setValorAluguel(imovel.getValorAluguel());
        newImovel.setPermuta(imovel.isPermuta());
        newImovel.setAceitaAnimais(imovel.isAceitaAnimais());
        newImovel.setTipoDeImovel(imovel.getTipoDeImovel());
        newImovel.setFinalidade(imovel.getFinalidade());
        newImovel.setArea(imovel.getArea());
        newImovel.setAreaConstruida(imovel.getAreaConstruida());
        return imovelRepository.save(newImovel);
    }

    public Imovel getById(Long id) {
        return imovelRepository.getReferenceById(id);
    }

    public List<Imovel> getAll() {
        return imovelRepository.findAll();
    }

    public Imovel update(Long id, Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void delete(Long id) {
        imovelRepository.deleteById(id);
    }
}

