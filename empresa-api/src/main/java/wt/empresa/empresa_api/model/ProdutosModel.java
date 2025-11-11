package wt.empresa.empresa_api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Produtos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco_custo")
    private Double precoCusto;

    @Column(name="preco_venda")
    private Double precoVenda;

    @Column(name="unidade")
    private String unidade;

    @JsonIgnore
    @OneToMany(mappedBy = "produtoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrcamentosItensModel> produtos;

    @JsonIgnore
    @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<OrdemServicoItensModel> ordemServicoItensModels;
}
