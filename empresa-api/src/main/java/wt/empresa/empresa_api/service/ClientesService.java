package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.ClienteModel;
import wt.empresa.empresa_api.repository.ClienteRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ClientesService {

    private final ClienteRepository clienteRepository;

    public ClienteModel criarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }


    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }

    public ClienteModel encontrarPorId(Long id){
            return clienteRepository.findById(id)
                    .orElseThrow( ()-> new NoSuchElementException("Cliente não encontrado"));

    }

    public void deletarPorId(Long id){
        encontrarPorId(id);
        clienteRepository.deleteById(id);
    }

    public ClienteModel atualizaPorId(Long id, ClienteModel cliente){

        ClienteModel clienteAtual = encontrarPorId(id);

        if (Objects.nonNull(cliente.getNome()) && !cliente.getNome().trim().isEmpty()) {
            clienteAtual.setNome(cliente.getNome());
        }


        if (Objects.nonNull(cliente.getEmail()) && !cliente.getEmail().trim().isEmpty()) {
            clienteAtual.setEmail(cliente.getEmail());
        }


        if (Objects.nonNull(cliente.getEndereco()) && !cliente.getEndereco().trim().isEmpty()) {
            clienteAtual.setEndereco(cliente.getEndereco());
        }


        if (Objects.nonNull(cliente.getTelefone()) && !cliente.getTelefone().trim().isEmpty()) {
            clienteAtual.setTelefone(cliente.getTelefone());
        }

        return clienteRepository.save(clienteAtual);
    }




}
