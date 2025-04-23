package com.carlossantos.CadastrodeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
