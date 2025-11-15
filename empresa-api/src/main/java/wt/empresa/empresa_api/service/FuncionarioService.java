package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.FuncionarioModel;
import wt.empresa.empresa_api.repository.FuncionarioRepository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

@Service
@AllArgsConstructor
public class FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);

    }
    public List<FuncionarioModel> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public FuncionarioModel encontrarPorId(Long id){
        return funcionarioRepository.findById(id)
                .orElseThrow( ()-> new NoSuchElementException("Funcionario não encontrado"));

    }

    public void deletarPorId(Long id){
        encontrarPorId(id);
        funcionarioRepository.deleteById(id);
    }

    public FuncionarioModel atualizaPorId(Long id, FuncionarioModel funcionario){

        FuncionarioModel funcionaAtual = encontrarPorId(id);

        if (Objects.nonNull(funcionario.getNome()) && !funcionario.getNome().trim().isEmpty()) {
            funcionaAtual.setNome(funcionario.getNome());
        }

        if (Objects.nonNull(funcionario.getCargo()) && !funcionario.getCargo().trim().isEmpty()) {
            funcionaAtual.setCargo(funcionario.getCargo());
        }

        if (Objects.nonNull(funcionario.getEmail()) && !funcionario.getEmail().trim().isEmpty()) {
            funcionaAtual.setEmail(funcionario.getEmail());
        }

        if (Objects.nonNull(funcionario.getTelefone()) && !funcionario.getTelefone().trim().isEmpty()) {
            funcionaAtual.setTelefone(funcionaAtual.getTelefone());
        }

        return funcionarioRepository.save(funcionaAtual);
    }

}
