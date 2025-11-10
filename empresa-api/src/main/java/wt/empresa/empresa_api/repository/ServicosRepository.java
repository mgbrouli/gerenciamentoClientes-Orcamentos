package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.ServicosModel;

public interface ServicosRepository extends JpaRepository<ServicosModel, Long> {
}
