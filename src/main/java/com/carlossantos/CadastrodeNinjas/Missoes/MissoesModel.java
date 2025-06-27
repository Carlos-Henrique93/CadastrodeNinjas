package com.carlossantos.CadastrodeNinjas.Missoes;


import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@NoArgsConstructor  //criação do construtor sem atributos
@AllArgsConstructor //Criação do construtores com todos atributos
@Data //Criação dos Getters e Setters
@ToString
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificulade;

    //Uma missão poder ter varios ninjas
    @OneToMany (mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
