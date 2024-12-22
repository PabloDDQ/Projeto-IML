package br.com.projetoiml.demo_sisteama_iml.Controller;

import br.com.projetoiml.demo_sisteama_iml.Model.*;
import br.com.projetoiml.demo_sisteama_iml.Service.*;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cadaver")
public class CadaverController {
    CadaverService cadaverService;

    public CadaverController(CadaverService cadaverService) {
        this.cadaverService = cadaverService;
    }

    @GetMapping("/{id}")
    public CadaverModel getCadaver(@PathVariable("id") String id) {

        return cadaverService.buscarPorId(id).orElse(null);
    };

    @GetMapping
    public List<CadaverModel> listar(){
        return cadaverService.listarTodos();
    }

    }

