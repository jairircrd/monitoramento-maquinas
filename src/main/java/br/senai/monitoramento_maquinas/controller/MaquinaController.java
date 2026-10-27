package br.senai.monitoramento_maquinas.controller;

import br.senai.monitoramento_maquinas.model.Maquina;
import br.senai.monitoramento_maquinas.service.MaquinaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maquinas")
public class MaquinaController {

    private final MaquinaService maquinaService;

    public MaquinaController(MaquinaService maquinaService) {
        this.maquinaService = maquinaService;
    }

    @GetMapping
    public ResponseEntity<List<Maquina>> listar() {
        return ResponseEntity.ok(maquinaService.listarTodas());
    }

    @PostMapping("/cadastro")
    public ResponseEntity<Maquina> cadastrar(
        @RequestBody Maquina maquina
    ) {
        return ResponseEntity.ok(
            maquinaService.cadastrar(maquina)
        );
    }
}