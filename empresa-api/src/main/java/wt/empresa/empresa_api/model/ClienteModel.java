package wt.empresa.empresa_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column(name="telefone")
    private String telefone;

    @Column(name="endereco")
    private String endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrcamentosModel> orcamentos;

    @OneToMany(mappedBy = "clienteId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdemServicosModel> ordemServicos;

}
