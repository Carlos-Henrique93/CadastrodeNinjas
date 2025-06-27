package com.carlossantos.CadastrodeNinjas.Ninjas;

import com.carlossantos.CadastrodeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

//Entity  transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor  //criação do construtor sem atributos
@AllArgsConstructor //Criação do construtores com todos atributos
@Data //Criação dos Getters e Setters
@ToString(exclude = "missoes")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_ninja")
    private Long id;

    @Column(name = "nome_ninja")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "aldeia_ninja")
    private String aldeia;

    @Column(name = "rank")
    private  String rank;

    @Column(name = "idade_ninja")
    private int idade;

    // @ManyToOne ela fala que relação de tabelas>> Um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // criando a chave estrageira do banco de dados
    private MissoesModel missoes;


}

