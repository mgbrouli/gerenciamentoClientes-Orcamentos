package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.EmpresaModel;

public interface EmpresaRepository extends JpaRepository<EmpresaModel, Long> {
}
