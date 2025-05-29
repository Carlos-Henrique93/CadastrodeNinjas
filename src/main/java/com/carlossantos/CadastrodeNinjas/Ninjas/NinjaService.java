package com.carlossantos.CadastrodeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos meus Ninjas
    // o findAll é mesmo que querry sql
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar todos os meus ninjas por ID

    //Listar todos meus Ninjas
    // o findAll é mesmo que querry sql
    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorID = ninjaRepository.findById(id);
        return ninjaPorID.orElse(null);
    }

    // Criar um novo Ninja
    public NinjaModel criarninja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    //Deleta o Ninja
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    //Atualiza Ninja (Cadastro)
    public NinjaModel atualizaNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            return ninjaRepository.save(ninjaAtualizado);
        }
    return null;
    }

}