package wt.empresa.empresa_api.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.ProdutosModel;
import wt.empresa.empresa_api.service.ProdutoService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;


    @GetMapping
    public ResponseEntity<List<ProdutosModel>> pegaProdutos(){
        return ResponseEntity.ok(produtoService.pegarProdutos());
    }

    @PostMapping
    public ResponseEntity<ProdutosModel> criarProdutos(@RequestBody ProdutosModel produto) throws RuntimeException {
        if(produto != null){

            if(produto.getPrecoVenda() <= produto.getPrecoCusto()){
                throw new IllegalArgumentException("O preço de venda não deve ser menor ou igual o custo");
            }else{
                produtoService.criarProdutos(produto);
                return ResponseEntity.status(HttpStatus.CREATED).body(produto);
            }

        }else{
            return ResponseEntity.badRequest().build();

        }

    }


}
