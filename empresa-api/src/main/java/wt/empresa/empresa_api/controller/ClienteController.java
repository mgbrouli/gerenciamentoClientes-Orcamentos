package wt.empresa.empresa_api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.ClienteModel;
import wt.empresa.empresa_api.service.ClientesService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/cliente")
public class ClienteController {


    private final ClientesService clientesService;

    @GetMapping
    public ResponseEntity<List<ClienteModel>> listarClientes(){
        return ResponseEntity.ok(clientesService.listarClientes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(clientesService.encontrarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ClienteModel> cadastrarCliente(@RequestBody ClienteModel cliente){
        if(cliente != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(clientesService.criarCliente(cliente));

        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id){
        clientesService.deletarPorId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteModel> atualizarCliente(@PathVariable Long id, @RequestBody ClienteModel cliente){
        if(cliente != null){
            ClienteModel clienteAtualizado = clientesService.atualizaPorId(id, cliente);
            return ResponseEntity.ok().body(clienteAtualizado);

        }else{
            return ResponseEntity.noContent().build();
        }
    }




}
