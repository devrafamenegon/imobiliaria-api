package br.edu.faj.poo.imobiliaria.ImobiliariaService.services;

import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente.LoginClienteDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.dtos.cliente.RegisterClienteDTO;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Cliente;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.entities.Imovel;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.errors.ClienteErrors;
import br.edu.faj.poo.imobiliaria.ImobiliariaService.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente register(RegisterClienteDTO cliente){
        if(clienteRepository.findByCpf(cliente.getCpf()) != null){
            throw new ClienteErrors.ClienteAlreadyExistsException();
        }

        if(clienteRepository.findByEmail(cliente.getEmail()) != null){
            throw new ClienteErrors.ClienteAlreadyExistsException();
        }

        Cliente newCliente = new Cliente();
        newCliente.setNome(cliente.getNome());
        newCliente.setCpf(cliente.getCpf());
        newCliente.setEmail(cliente.getEmail());
        newCliente.setDataNascimento(cliente.getDataNascimento());
        newCliente.setSenha(cliente.getSenha());
        newCliente.setTelefone(cliente.getTelefone());

        return clienteRepository.save(newCliente);
    }

    public Cliente login(LoginClienteDTO loginRequest) {
        Cliente login = clienteRepository.findByEmail(loginRequest.getEmail());
        if(login == null || !login.getSenha().equals(loginRequest.getSenha())){
            throw new ClienteErrors.InvalidCredentialsException();
        }
        return login;
    }
}
