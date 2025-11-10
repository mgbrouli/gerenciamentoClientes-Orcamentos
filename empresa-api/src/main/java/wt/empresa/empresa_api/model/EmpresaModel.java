package wt.empresa.empresa_api.model;


import jakarta.persistence.*;

@Entity
@Table(name="Empresa")
public class EmpresaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="endereco")
    private String endereco;

    @Column(name="telefone")
    private String telefone;

    @Column(name="email")
    private String email;

    @Column(name="logo_url")
    private String logo_url;


}
