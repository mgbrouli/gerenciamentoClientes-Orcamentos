package wt.empresa.empresa_api.service;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import wt.empresa.empresa_api.model.EmpresaModel;
import wt.empresa.empresa_api.repository.EmpresaRepository;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class EmpresaService {

    private final EmpresaRepository empresaRepository;

    public List<EmpresaModel> listarEmpresas() {
        return empresaRepository.findAll();
    }

    public EmpresaModel criarEmpresa(EmpresaModel empresa) {
        return empresaRepository.save(empresa);

    }

    public EmpresaModel atualizarEmpresa(EmpresaModel empresa) {
        EmpresaModel empresaFutura = empresaRepository.findById(1L).orElseThrow(
                () -> new RuntimeException("Algo deu errado empresa não encontrada")
        );

        if (Objects.nonNull(empresa.getNome()) && !empresa.getNome().trim().isEmpty()) {
            empresaFutura.setNome(empresa.getNome());
        }


        if (Objects.nonNull(empresa.getCnpj()) && !empresa.getCnpj().trim().isEmpty()) {
            empresaFutura.setCnpj(empresa.getCnpj());
        }


        if (Objects.nonNull(empresa.getEndereco()) && !empresa.getEndereco().trim().isEmpty()) {
            empresaFutura.setEndereco(empresa.getEndereco());
        }


        if (Objects.nonNull(empresa.getTelefone()) && !empresa.getTelefone().trim().isEmpty()) {
            empresaFutura.setTelefone(empresa.getTelefone());
        }
        if (Objects.nonNull(empresa.getEmail()) && !empresa.getEmail().trim().isEmpty()) {
            empresaFutura.setEmail(empresa.getEmail());
        }
        if (Objects.nonNull(empresa.getLogoUrl()) && !empresa.getLogoUrl().trim().isEmpty()) {
            empresaFutura.setLogoUrl(empresa.getLogoUrl());
        }

        return empresaRepository.save(empresaFutura);
    }
}



