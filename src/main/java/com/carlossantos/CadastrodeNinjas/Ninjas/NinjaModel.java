package com.carlossantos.CadastrodeNinjas.Ninjas;

import com.carlossantos.CadastrodeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity  transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor  //criação do construtor sem atributos
@AllArgsConstructor //Criação do construtores com todos atributos
@Data //Criação dos Getters e Setters
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;
    private int idade;

    // @ManyToOne ela fala que relação de tabelas>> Um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // criando a chave estrageira do banco de dados
    private MissoesModel missoes;


}

