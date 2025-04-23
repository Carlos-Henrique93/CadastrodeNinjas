package com.carlossantos.CadastrodeNinjas.Missoes;

import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }
    //Listar todas as Missoes

    public List<MissoesModel> listarMissao (){
        return missoesRepository.findAll();
    }

}
