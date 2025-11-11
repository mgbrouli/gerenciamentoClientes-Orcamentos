package wt.empresa.empresa_api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.ServicosModel;
import wt.empresa.empresa_api.service.ServicosService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/servicos")
public class ServicoController {

    private final ServicosService servicosService;

    @GetMapping
    public ResponseEntity<List<ServicosModel>> getServices(){
        return ResponseEntity.ok(servicosService.listarServicos());
    }

    @PostMapping
    public ResponseEntity<ServicosModel> addServices(@RequestBody ServicosModel servico){
        if(servico != null){
            if(servicosService.criarServicos(servico) != null)
            {
                return ResponseEntity.badRequest().build();
            }else{
                return ResponseEntity.status(HttpStatus.CREATED).body(servico);
            }

        }else
        {
            return ResponseEntity.badRequest().build();
        }
    }
}
