package wt.empresa.empresa_api.controller;

import com.sun.net.httpserver.HttpsServer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wt.empresa.empresa_api.model.ProdutosModel;
import wt.empresa.empresa_api.service.ProdutoService;

import javax.swing.text.html.parser.Entity;
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
            produtoService.criarProdutos(produto);
            return ResponseEntity.status(HttpStatus.CREATED).body(produto);
        }else{
            return ResponseEntity.noContent().build();

        }

    }


}
