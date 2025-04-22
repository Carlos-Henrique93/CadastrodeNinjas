package com.carlossantos.CadastrodeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas (){
        return "Essa é minha primeira mensagem nessa rota!";

    }

    // Adicionar Ninjas (Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return  "Ninja Criado!";
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/listar")
    public String mostrarTodosOsNinjas(){
        return  "Mostrar Ninja!";
    }

    // Mostrar todos os Ninjas por Id (Read)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId(){
        return  "Mostrar Ninja por Id!";
    }

    // Alterar Ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por Id";
    }

    // Deletar Ninjas (Delete)
    @DeleteMapping("/deletarID")
    public String deletaPorId(){
        return "Ninja deletado por Id";
    }
}
