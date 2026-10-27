package br.senai.monitoramento_maquinas.service;

import br.senai.monitoramento_maquinas.model.Maquina;
import br.senai.monitoramento_maquinas.model.Producao;
import br.senai.monitoramento_maquinas.repository.MaquinaRepository;
import br.senai.monitoramento_maquinas.repository.ProducaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducaoService {

    private final ProducaoRepository producaoRepository;
    private final MaquinaRepository maquinaRepository;

    public ProducaoService(
        ProducaoRepository producaoRepository,
        MaquinaRepository maquinaRepository
    ) {
        this.producaoRepository = producaoRepository;
        this.maquinaRepository = maquinaRepository;
    }

    public Producao cadastrar(Producao producao) {

        Long maquinaId = producao.getMaquina().getId();

        Maquina maquina = maquinaRepository
            .findById(maquinaId)
            .orElseThrow(() ->
                new RuntimeException("Máquina não encontrada")
            );

        producao.setMaquina(maquina);

        return producaoRepository.save(producao);
    }

    public List<Producao> listarTodas() {
        return producaoRepository.findAll();
    }
}