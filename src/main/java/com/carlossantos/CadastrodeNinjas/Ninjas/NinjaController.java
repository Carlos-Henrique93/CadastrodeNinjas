package com.carlossantos.CadastrodeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é minha primeira mensagem nessa rota!";

    }

    // Adicionar Ninjas (Create)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        NinjaDTO novoNinja = ninjaService.criarninja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com Sucesso: " + novoNinja.getNome() + "(ID): " + novoNinja.getId());
    }

    // Mostrar todos os Ninjas (Read)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>>  listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Mostrar todos os Ninjas por Id (Read)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) {
        NinjaDTO listaNinjaId =  ninjaService.listarNinjasPorId(id);

        if (listaNinjaId != null){
           return ResponseEntity.ok(listaNinjaId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com ID " + id + " não existe em nossos registros!");
        }
    }

    // Alterar Ninjas (Update)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {

      NinjaDTO ninja = ninjaService.atualizaNinja(id, ninjaAtualizado);

      if(ninja != null){
        return ResponseEntity.ok(ninja);
      } else {
          return  ResponseEntity.status(HttpStatus.NOT_FOUND)
                  .body("Ninja com ID " + id + " não existe em nossos registros!");
      }

    }

    // Deletar Ninjas (Delete)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletaPorId(@PathVariable Long id) {
        var ninja = ninjaService.listarNinjasPorId(id);

        if (ninja != null) {
            String nome = ninja.getNome(); // captura o nome antes de deletar
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com ID " + id + " e nome " + nome + " deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com o ID " + id + " informado não foi encontrado!");
        }
    }
}