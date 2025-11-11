package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.ServicosModel;
import wt.empresa.empresa_api.repository.ServicosRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class ServicosService {

    private final ServicosRepository servicosRepository;

    public List<ServicosModel> listarServicos(){
        return servicosRepository.findAll();
    }

    private boolean existPorNome(String name){
        return servicosRepository.existsByNomeContainingIgnoreCase(name);
    }

    public ServicosModel criarServicos(ServicosModel servico){

        if(existPorNome(servico.getNome())){
            return null;
        }else{
            return servicosRepository.save(servico);
        }
    }


}
