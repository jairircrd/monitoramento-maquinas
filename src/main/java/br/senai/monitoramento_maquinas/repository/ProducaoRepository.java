package br.senai.monitoramento_maquinas.repository;

import br.senai.monitoramento_maquinas.model.Producao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProducaoRepository extends JpaRepository<Producao, Long> {
}