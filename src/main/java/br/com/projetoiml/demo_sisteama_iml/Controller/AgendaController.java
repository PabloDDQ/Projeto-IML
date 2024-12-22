package br.com.projetoiml.demo_sisteama_iml.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.projetoiml.demo_sisteama_iml.Model.AgendaModel;
import br.com.projetoiml.demo_sisteama_iml.Service.AgendaService;


@RestController
@RequestMapping("/api/agendas")
public class AgendaController { 
    
    @Autowired
    AgendaService service;

    @GetMapping
    public List<AgendaModel> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{data}")
    public ResponseEntity<AgendaModel> buscarPorId(@PathVariable String data){
        Optional<AgendaModel> agenda = service.buscarPorId(data);
        return agenda.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping
public ResponseEntity<AgendaModel> criar(@RequestBody AgendaModel agenda) {
    try {
        service.alocarMedicos(agenda);
    } catch (Exception e) {
        System.out.println("Erro ao alocar médicos: " + e.getMessage());
        return ResponseEntity.badRequest().body(null);
    }

    try {
        service.verificaAutopsias(agenda);
    } catch (Exception e) {
        System.out.println("Erro ao verificar autópsias: " + e.getMessage());
        return ResponseEntity.badRequest().body(null);
    }

    try {
        service.organizaAgenda(agenda);
    } catch (Exception e) {
        System.out.println("Erro ao organizar agenda: " + e.getMessage());
        return ResponseEntity.badRequest().body(null);
    }

    try {
        return ResponseEntity.ok(service.salvar(agenda));
    } catch (IllegalArgumentException e) {
        System.out.println("Erro ao salvar agenda: " + e.getMessage());
        return ResponseEntity.badRequest().body(null);
    }
}

  
    @PutMapping("/{data}")
    public ResponseEntity<AgendaModel> atualizar(@PathVariable String data, @RequestBody AgendaModel agenda){
        Optional<AgendaModel> agendaExistente = service.buscarPorId(data);

        if(agendaExistente.isPresent()){
            agenda.setData(data);

            try {
                service.alocarMedicos(agenda);
            } catch (Exception e) {
                System.out.println("Erro ao alocar médicos: " + e.getMessage());
                return ResponseEntity.badRequest().body(null);
            }
        
            try {
                service.verificaAutopsias(agenda);
            } catch (Exception e) {
                System.out.println("Erro ao verificar autópsias: " + e.getMessage());
                return ResponseEntity.badRequest().body(null);
            }
        
            try {
                service.organizaAgenda(agenda);
            } catch (Exception e) {
                System.out.println("Erro ao organizar agenda: " + e.getMessage());
                return ResponseEntity.badRequest().body(null);
            }
            
            try {
              return ResponseEntity.ok(service.salvar(agenda));  
            } catch (IllegalArgumentException e) {
                return ResponseEntity.badRequest().body(null);
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{data}")
    public ResponseEntity<AgendaModel> deletar(@PathVariable String data){
        if(service.buscarPorId(data).isPresent()){
            service.deletar(data);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    
}
