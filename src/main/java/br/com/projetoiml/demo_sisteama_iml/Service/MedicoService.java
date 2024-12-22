package br.com.projetoiml.demo_sisteama_iml.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoiml.demo_sisteama_iml.Model.MedicoModel;
import br.com.projetoiml.demo_sisteama_iml.Repository.MedicoRepository;

@Service
public class MedicoService {
    @Autowired
    MedicoRepository medicoRepository;

    public List<MedicoModel> listarTodos(){
        return medicoRepository.findAll();
    }

    public Optional<MedicoModel> buscarPorId(String crm){
        return medicoRepository.findById(crm);
    }

    public MedicoModel salvar(MedicoModel medico){
        if(medico.getNome() == null || medico.getNome().isEmpty() || medico.getHorariosDisponiveis() == null || medico.getHorariosDisponiveis().isEmpty()){
            throw new IllegalArgumentException("Todos os campos devem ser preenchidos para conclusão do processo");
        }else{
            System.out.println("Médico salvo com sucesso");
            return medicoRepository.save(medico);
        }
    }

    public void deletar(String crm){
        medicoRepository.deleteById(crm);
    }

}
