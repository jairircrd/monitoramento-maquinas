package br.senai.monitoramento_maquinas.controller;

import br.senai.monitoramento_maquinas.model.Producao;
import br.senai.monitoramento_maquinas.service.ProducaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producao")
public class ProducaoController {

    private final ProducaoService producaoService;

    public ProducaoController(ProducaoService producaoService) {
        this.producaoService = producaoService;
    }

    @GetMapping
    public ResponseEntity<List<Producao>> listar() {
        return ResponseEntity.ok(
            producaoService.listarTodas()
        );
    }

    @PostMapping
    public ResponseEntity<Producao> cadastrar(
        @RequestBody Producao producao
    ) {
        return ResponseEntity.ok(
            producaoService.cadastrar(producao)
        );
    }
}