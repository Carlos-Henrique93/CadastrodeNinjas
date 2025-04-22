package com.carlossantos.CadastrodeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("missoes") //
public class MissoesController  {

    //GET -- Mandar uma requisição para listar todas as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return ("Missao Listada!");
    }

    //POST -- Mandar uma requisição para Criar as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return ("Missao Criada!");
    }

    //PUT -- Mandar uma requisição para alterar a missao
    @PutMapping("/alterar")
    public String alterarMissao(){
        return ("Missao Alterada!");
    }

    //DELETE -- Mandar uma requisição para Deletar a missao
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return ("Missao Deletada!");
    }



}
