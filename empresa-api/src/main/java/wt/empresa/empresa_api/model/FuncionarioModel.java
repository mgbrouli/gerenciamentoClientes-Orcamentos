package wt.empresa.empresa_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="Funcionarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="cargo")
    private String cargo;

    @Column(name="email")
    private String email;

    @Column(name="telefone")
    private String telefone;

    @OneToMany(mappedBy = "responsavelId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrdemServicosModel> responsavel;


}
