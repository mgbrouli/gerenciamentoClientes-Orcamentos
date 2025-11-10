package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}
