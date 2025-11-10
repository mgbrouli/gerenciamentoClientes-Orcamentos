package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.OrdemServicosModel;

public interface OrdemServicosRepository extends JpaRepository<OrdemServicosModel, Long> {
}
