package br.com.projetoiml.demo_sisteama_iml.Service;

import br.com.projetoiml.demo_sisteama_iml.Repository.*;
import br.com.projetoiml.demo_sisteama_iml.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CadaverService {

    public List<String> nomesCadaverM = new ArrayList<>();
    public List<String> nomesCadaverF = new ArrayList<>();
    public List<String> sobrenomesCadaver = new ArrayList<>();
    public List<String> causaMortecadaver = new ArrayList<>();

    @Autowired
    CadaverRepository cadaverRepository;


    public void geraRelatorioCadaver(){
        SorteioModel sorteio = new SorteioModel(nomesCadaverM, nomesCadaverF, sobrenomesCadaver, causaMortecadaver);
        CadaverModel cadaver = new CadaverModel();

        sorteio.sorteioCadaver(cadaver);
        cadaverRepository.save(cadaver);
        System.out.println("Cadaver de id " + cadaver.getId() + " gerado");
    
    }

    public Optional<CadaverModel> buscarPorId(String id){
        return cadaverRepository.findById(id);
    }

    public List<CadaverModel> listarTodos(){
        return cadaverRepository.findAll();
    }

}
