package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.OrdemServicoItensModel;

public interface OrdemServicosItensRepository extends JpaRepository<OrdemServicoItensModel, Long> {
}
