package br.senai.monitoramento_maquinas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistemaController {

    @GetMapping("/")
    public String inicio() {
        return "API de Monitoramento de Máquinas";
    }

    @GetMapping("/status")
    public String status() {
        return "Sistema operacional";
    }

    @GetMapping("/versao")
    public String versao() {
        return "1.0.0";
    }
}