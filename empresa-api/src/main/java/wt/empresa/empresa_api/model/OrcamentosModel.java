package wt.empresa.empresa_api.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="Orcamentos")
public class OrcamentosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name= "data_criacao")
    @JsonFormat(pattern = "dd/MM/yyy")
    private LocalDate data_criacao;

    @Column(name = "descricao")
    private String descricao;

    @Column(name ="valor_total")
    private Double valor_total;

    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private ClienteModel cliente;

}
