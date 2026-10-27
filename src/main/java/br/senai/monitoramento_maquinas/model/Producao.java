package br.senai.monitoramento_maquinas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "producoes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Producao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "maquina_id", nullable = false)
    private Maquina maquina;

    @Column(nullable = false)
    private Double consumoKw;

    @Column(nullable = false)
    private LocalDateTime horarioAcionamento;

    @Column(nullable = false)
    private Integer pecasProduzidas;
}