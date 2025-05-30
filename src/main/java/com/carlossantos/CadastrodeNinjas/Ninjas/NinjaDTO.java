package com.carlossantos.CadastrodeNinjas.Ninjas;

import com.carlossantos.CadastrodeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

       private Long id;
       private String nome;
       private String email;
       private String aldeia;
       private int idade;
       private  String rank;
       private MissoesModel missoes;

    }
