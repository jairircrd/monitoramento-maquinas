package br.senai.monitoramento_maquinas.repository;

import br.senai.monitoramento_maquinas.model.Maquina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaquinaRepository extends JpaRepository<Maquina, Long> {
}