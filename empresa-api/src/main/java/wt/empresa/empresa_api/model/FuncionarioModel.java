package wt.empresa.empresa_api.model;

import jakarta.persistence.*;

@Entity
@Table(name="Funcionarios")
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


}
