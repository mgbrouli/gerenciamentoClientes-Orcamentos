package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.OrcamentosModel;

public interface OrcamentosRepository extends JpaRepository<OrcamentosModel, Long> {
}
