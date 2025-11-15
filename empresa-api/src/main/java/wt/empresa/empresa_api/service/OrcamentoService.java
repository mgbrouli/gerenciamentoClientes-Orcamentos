package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.OrcamentosModel;
import wt.empresa.empresa_api.repository.OrcamentosRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OrcamentoService {

    private final OrcamentosRepository orcamentosRepository;
    private final ClientesService clientesService;


    public List<OrcamentosModel> listarOrcamentos(){
        return orcamentosRepository.findAll();
    }


    public OrcamentosModel criarOrcamento(OrcamentosModel orcamento){
        return orcamentosRepository.save(orcamento);
    }



}
