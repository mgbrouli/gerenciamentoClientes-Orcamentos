package wt.empresa.empresa_api.model;


import jakarta.persistence.*;

@Entity
@Table(name="Produtos")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco_custo")
    private Double preco_custo;

    @Column(name="preco_venda")
    private Double preco_venda;

    @Column(name="unidade")
    private String unidade;
}
