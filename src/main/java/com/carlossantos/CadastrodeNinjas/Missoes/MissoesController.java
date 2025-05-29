package com.carlossantos.CadastrodeNinjas.Missoes;


import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("missoes") //
public class MissoesController  {

    private MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    //GET -- Mandar uma requisição para listar todas as missoes
    @GetMapping("/listar")
    public List<MissoesModel> listarMissao(){
        return missoesService.listarMissao();
    }

    // Mostrar todas as missoes por Id (Read) em conjunto com o service
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missoesService.listarMissoesPorId(id);
    }

    //POST -- Mandar uma requisição para Criar as missoes
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao){
        return missoesService.criarMissao(missao);
    }

    //PUT -- Mandar uma requisição para alterar a missao
    @PutMapping("/alterar/{id}")
    public MissoesModel alterarMissaoPorID(@PathVariable Long id, @RequestBody MissoesModel missaoAtualizado){
        return missoesService.atualizaMissao(id, missaoAtualizado );
    }

    //DELETE -- Mandar uma requisição para Deletar a missao
    // Void pois não precisar retornar
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missoesService.deletarMissaoPorId(id);
    }

}
