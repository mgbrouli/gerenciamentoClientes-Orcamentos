package wt.empresa.empresa_api.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.ClienteModel;
import wt.empresa.empresa_api.model.FuncionarioModel;
import wt.empresa.empresa_api.service.FuncionarioService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/funcionario")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;


    @GetMapping
    public ResponseEntity<List<FuncionarioModel>> getFuncionarios(){
        return ResponseEntity.ok().body(funcionarioService.listarFuncionario());
    }
    @GetMapping("/{id}")
    public ResponseEntity<FuncionarioModel> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok().body(funcionarioService.encontrarPorId(id));
    }

    @PostMapping
    public ResponseEntity<FuncionarioModel> cadastrarCliente(@RequestBody FuncionarioModel funcionario){
        if(funcionario != null){
            return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.criarFuncionario(funcionario));

        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFuncionario(@PathVariable Long id){
        funcionarioService.deletarPorId(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FuncionarioModel> atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioModel funcionario) {
        if (funcionario != null) {
            FuncionarioModel funcionarioAtualizado = funcionarioService.atualizaPorId(id, funcionario);
            return ResponseEntity.ok().body(funcionarioAtualizado);

        } else {
            return ResponseEntity.noContent().build();
        }
    }
}
