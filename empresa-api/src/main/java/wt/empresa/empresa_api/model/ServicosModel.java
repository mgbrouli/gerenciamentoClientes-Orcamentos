package wt.empresa.empresa_api.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Servicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServicosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco_fixo")
    private double precoFixo;

    @OneToMany(mappedBy = "servicosId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrcamentosItensModel> itensDoOrcamento;

    @OneToMany(mappedBy = "servicos", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdemServicoItensModel> ordemServicoItensModels;
}
