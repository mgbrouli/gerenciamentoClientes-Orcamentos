package wt.empresa.empresa_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Ordem_servicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdemServicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteModel clienteId;

    @ManyToOne
    @JoinColumn(name = "responsavel_id", nullable = false)
    private FuncionarioModel responsavelId;

    @Column(name = "data_abertura")
    private LocalDate dataAbertura;

    @Column(name = "data_fechamento")
    private LocalDate dataFechamento;

    @Column(name = "aparelho_tipo")
    private String aparelhoTipo;
    @Column(name = "aparelho_marca")
    private String aparelhoMarca;
    @Column(name = "aparelho_modelo")
    private String aparelhoModelo;

    @Column(name = "problema_relatado")
    private String problemaRelatado;
    @Column(name = "diagnostico_tecnico")
    private String diagnosticoTecnico;
    @Column(name = "status")
    private String status;
    @Column(name = "valor_total")
    private double valorTotal;

    @OneToMany(mappedBy = "ordemServicos", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdemServicoItensModel> ordemServicoItensModels;




}
