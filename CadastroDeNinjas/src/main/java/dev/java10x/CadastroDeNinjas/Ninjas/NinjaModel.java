package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma claase em uma entidade no BD
// JPA = Java Persistence API
@Entity
// Table gera uma tabela
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor @AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    // @ManyToOne - Um ninja tem uma unica missao
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key
    private MissoesModel missoes;
}
