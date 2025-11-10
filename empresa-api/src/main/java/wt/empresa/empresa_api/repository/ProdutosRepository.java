package wt.empresa.empresa_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.empresa.empresa_api.model.ProdutosModel;

public interface ProdutosRepository extends JpaRepository<ProdutosModel, Long> {
}
