package wt.empresa.empresa_api.model;


import jakarta.persistence.*;

@Entity
@Table(name="Servicos")
public class ServicosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco_fixo")
    private double preco_fixo;
}
