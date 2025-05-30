package com.carlossantos.CadastrodeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas (){
        return "Essa é minha primeira mensagem nessa rota!";

    }

    // Adicionar Ninjas (Create)
    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarninja(ninja);
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar todos os Ninjas por Id (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar Ninjas (Update)
    @PutMapping("/alterar/{id}")
    public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado ){
        return ninjaService.atualizaNinja(id, ninjaAtualizado);
    }

    // Deletar Ninjas (Delete)
    @DeleteMapping("/deletar/{id}")
    public void deletaPorId(@PathVariable Long id){
    ninjaService.deletarNinjaPorId(id);
    }
}
