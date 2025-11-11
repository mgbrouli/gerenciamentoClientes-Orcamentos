package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.ClienteModel;
import wt.empresa.empresa_api.repository.ClienteRepository;

import java.util.List;

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

    public ClienteModel encontrarPorId(ClienteModel cliente){
            return clienteRepository.findById(cliente.getId())
                    .orElseThrow( ()-> new RuntimeException("Cliente não encontrado"));

    }




}
