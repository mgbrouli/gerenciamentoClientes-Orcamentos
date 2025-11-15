package wt.empresa.empresa_api.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.OrcamentosModel;
import wt.empresa.empresa_api.service.OrcamentoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/orcamento")
public class OrcamentoController {

    private final OrcamentoService orcamentoService;

    @GetMapping
    public ResponseEntity<List<OrcamentosModel>> getOrcamento(){
        return ResponseEntity.ok().body(orcamentoService.listarOrcamentos());
    }

    @PostMapping
    public ResponseEntity<OrcamentosModel> postOrcamento(@RequestBody OrcamentosModel orcamento){
        return ResponseEntity.status(HttpStatus.CREATED).body(orcamentoService.criarOrcamento(orcamento));
    }


}
