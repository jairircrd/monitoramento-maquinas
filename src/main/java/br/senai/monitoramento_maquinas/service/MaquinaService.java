package br.senai.monitoramento_maquinas.service;

import br.senai.monitoramento_maquinas.model.Maquina;
import br.senai.monitoramento_maquinas.repository.MaquinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaquinaService {

    private final MaquinaRepository maquinaRepository;

    public MaquinaService(MaquinaRepository maquinaRepository) {
        this.maquinaRepository = maquinaRepository;
    }

    public Maquina cadastrar(Maquina maquina) {
        return maquinaRepository.save(maquina);
    }

    public List<Maquina> listarTodas() {
        return maquinaRepository.findAll();
    }
}