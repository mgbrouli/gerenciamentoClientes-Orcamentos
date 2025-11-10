package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
