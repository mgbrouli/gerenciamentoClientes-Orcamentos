package wt.empresa.empresa_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Orcamentos_itens")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrcamentosItensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="orcamento_id", nullable = false)
    private OrcamentosModel orcamentoId;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable = false)
    private ProdutosModel produtoId;

    @ManyToOne
    @JoinColumn(name="servico_id", nullable = false)
    private ServicosModel servicosId;



    @Column(name="quantidade")
    private int quantidade;

    @Column(name="preco_unitaro")
    private Double precoUnitario;

}
