package br.com.projetoiml.demo_sisteama_iml.Controller;

import br.com.projetoiml.demo_sisteama_iml.Model.MedicoModel;
import br.com.projetoiml.demo_sisteama_iml.Service.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @GetMapping
    public List<MedicoModel> listarTodos(){
        return medicoService.listarTodos();
    }

    @GetMapping("/{crm}")
    public ResponseEntity<MedicoModel> buscarPorId(@PathVariable String crm){
        Optional<MedicoModel> medico = medicoService.buscarPorId(crm);
        return medico.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<MedicoModel> criar(@RequestBody MedicoModel medico){
        try{

            return ResponseEntity.ok(medicoService.salvar(medico));
        }catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @PutMapping("/{crm}")
    public ResponseEntity<MedicoModel> atualizar(@PathVariable String crm,@RequestBody MedicoModel medico){
        Optional<MedicoModel> medicoExistente = medicoService.buscarPorId(crm);

        if(medicoExistente.isPresent()){
            medico.setCrm(crm);

            try {
              return ResponseEntity.ok(medicoService.salvar(medico));  
            } catch (IllegalArgumentException e) {
                return ResponseEntity.badRequest().body(null);
            }
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{crm}")
    public ResponseEntity<MedicoModel> deletar(@PathVariable String crm){
        if(medicoService.buscarPorId(crm).isPresent()){
            medicoService.deletar(crm);
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }    


}
