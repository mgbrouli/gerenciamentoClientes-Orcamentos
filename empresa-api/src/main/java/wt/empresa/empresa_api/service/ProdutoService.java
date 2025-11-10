package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.ProdutosModel;
import wt.empresa.empresa_api.repository.ProdutosRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProdutoService {

    private final ProdutosRepository produtoRepository;


    public ProdutosModel criarProdutos(ProdutosModel produto){
        return produtoRepository.save(produto);
    }

    public List<ProdutosModel> pegarProdutos(){
        return produtoRepository.findAll();
    }
}
