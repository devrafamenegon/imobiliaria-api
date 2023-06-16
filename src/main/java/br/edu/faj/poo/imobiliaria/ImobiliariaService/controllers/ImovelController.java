package br.edu.faj.poo.imobiliaria.ImobiliariaService.controllers;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.Response;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.imovel.CreateImovelDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Imovel;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.errors.ExceptionHandlerController;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.services.ImovelService;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/imovel")
public class ImovelController {
    @Autowired
    ImovelService imovelService;

    @Autowired
    MessageUtil messageUtil;

    @PostMapping
    public ResponseEntity<Response> create(@RequestBody CreateImovelDTO imovel) {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.imovelCreateSuccessMessage, imovelService.create(imovel)));
        } catch (Exception e) {
            return ExceptionHandlerController.handleException(e);
        }
    }

    @GetMapping
    public ResponseEntity<Response> getAll() {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.imovelGetManySuccessMessage, imovelService.getAll()));
        } catch (Exception e) {
            return ExceptionHandlerController.handleException(e);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response> getById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.imovelGetOneSuccessMessage, imovelService.getById(id)));
        } catch (Exception e) {
            return ExceptionHandlerController.handleException(e);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Response> update(@PathVariable Long id, @RequestBody Imovel imovel) {
        try {
            return ResponseEntity.ok().body(Response.success(messageUtil.imovelUpdateSuccessMessage, imovelService.update(id, imovel)));
        } catch (Exception e) {
            return ExceptionHandlerController.handleException(e);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> delete(@PathVariable Long id) {
        try {
            imovelService.delete(id);
            return ResponseEntity.ok().body(Response.success(messageUtil.imovelDeleteSuccessMessage, null));
        } catch (Exception e) {
            return ExceptionHandlerController.handleException(e);
        }
    }
}
