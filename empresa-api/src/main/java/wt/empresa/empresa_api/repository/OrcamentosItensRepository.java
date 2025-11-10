package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.OrcamentosItensModel;

public interface OrcamentosItensRepository extends JpaRepository<OrcamentosItensModel, Long> {
}
