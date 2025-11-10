package wt.empresa.empresa_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Ordem_servicos_itens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdemServicoItensModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "os_id", nullable = false)
    private OrdemServicosModel ordemServicos;

    @ManyToOne
    @JoinColumn(name="produto_id", nullable = false)
    private ProdutosModel produto;

    @ManyToOne
    @JoinColumn(name="servico_id", nullable = false)
    private ServicosModel servicos;

    @Column(name="preco_unitario")
    private double precoUnitario;
}
