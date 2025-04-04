package com.carlossantos.CadastrodeNinjas.Missoes;


import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificulade;

    //Uma missão poder ter varios ninjas
    @OneToMany (mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
