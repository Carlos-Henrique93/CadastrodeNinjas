package com.carlossantos.CadastrodeNinjas.Ninjas;

import com.carlossantos.CadastrodeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

//Entity  transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // @ManyToOne ela fala que relação de tabelas>> Um ninja pode ter apenas uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // criando a chave estrageira do banco de dados
    private MissoesModel missoes;


    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

