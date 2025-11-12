package wt.empresa.empresa_api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.EmpresaModel;
import wt.empresa.empresa_api.service.EmpresaService;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/empresa")
public class EmpresaController {

    private final EmpresaService empresaService;

    @GetMapping
    public ResponseEntity<EmpresaModel> encontrarEmpresa(){
        return ResponseEntity.ok().body((EmpresaModel) empresaService.listarEmpresas());
    }

    @PutMapping
    public ResponseEntity<EmpresaModel> atualizaEmpresa(@RequestBody EmpresaModel empresa){
        return ResponseEntity.ok().body(empresaService.atualizarEmpresa(empresa));
    }

    @PostMapping
    public ResponseEntity<EmpresaModel> cirarEmoresa(@RequestBody EmpresaModel empresa){
        empresaService.criarEmpresa(empresa);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
