package com.carlossantos.CadastrodeNinjas.Missoes;

import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaModel;
import com.carlossantos.CadastrodeNinjas.Ninjas.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }
    //Listar todas as Missoes cadastradas
    public List<MissoesModel> listarMissao (){
        return missoesRepository.findAll();
    }

    // Listar todos as missoes por ID - filtrando por ID em conjunto com o Controller
    public MissoesModel listarMissoesPorId(long id) {
        Optional<MissoesModel> missaoPorID = missoesRepository.findById(id);
        return missaoPorID.orElse(null);
    }

    // Criar uma nova Missão
    public MissoesModel criarMissao(MissoesModel missao) {
        return missoesRepository.save(missao);
    }

    //Deleta a Missao
    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }
}
