package wt.empresa.empresa_api.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name="Orcamentos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrcamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name= "data_criacao")
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate dataCriacao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name ="valor_total")
    private Double valorTotal;

    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private ClienteModel cliente;


    @OneToMany(mappedBy = "orcamentoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrcamentosItensModel> itens;


}
