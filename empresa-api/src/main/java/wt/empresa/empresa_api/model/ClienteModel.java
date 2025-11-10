package wt.empresa.empresa_api.model;

import jakarta.persistence.*;

@Entity
@Table(name="Clientes")
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
}
