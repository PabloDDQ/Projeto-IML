package br.com.projetoiml.demo_sisteama_iml.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoiml.demo_sisteama_iml.Model.AgendaModel;
import br.com.projetoiml.demo_sisteama_iml.Model.MedicoModel;
import br.com.projetoiml.demo_sisteama_iml.Repository.*;

@Service
public class AgendaService {
    @Autowired
    AgendaRepository agendaRepository;

    @Autowired
    MedicoRepository medicoRepository;

    @Autowired 
    CadaverRepository cadaverRepository;

    @Autowired
    CadaverService cadaverService;

    public List<AgendaModel> listarTodos(){
        return agendaRepository.findAll();
    }

    public Optional<AgendaModel> buscarPorId(String data){
        return agendaRepository.findById(data);
    }

    public AgendaModel salvar(AgendaModel agenda){
        if(agenda.getHorarioFinal() == null || agenda.getHorarioIncio() == null || agenda.getNumDeCorpos() == 0){
            throw new IllegalArgumentException("Todos os campos devem ser preenchidos para conclusão do processo");
        }else{
            System.out.println("Salvo com sucesso"); 
            return agendaRepository.save(agenda);
        }
    }

    public void deletar(String crm){
        agendaRepository.deleteById(crm);
    }

    public void alocarMedicos(AgendaModel agenda){

        List<MedicoModel> medicos = medicoRepository.findAll();
        if(medicos.isEmpty()){
            throw new IllegalArgumentException("Nenhum médico disponivel para alocação");
        }
        
        for(MedicoModel medico : medicos){
            if (medico.getHorariosDisponiveis() == null || medico.getHorariosDisponiveis().isEmpty()) {
                System.out.println("Médico " + medico.getNome() + " não possui horários disponíveis.");
                continue; // Pule médicos sem horários
            }

            if (agenda.getHorarioIncio() == null || agenda.getHorarioFinal() == null || 
                agenda.getHorarioIncio() >= agenda.getHorarioFinal()) {
                throw new IllegalArgumentException("Horários de início e fim da agenda são inválidos.");
            }

            agenda.getMedicosAlocados().add(medico);
            for(int i = 0; i < medico.getHorariosDisponiveis().size(); i++){
                if(medico.getHorariosDisponiveis().get(i)>= agenda.getHorarioIncio() && medico.getHorariosDisponiveis().get(i) <= agenda.getHorarioFinal() ){
                    agenda.getHorariosAutopsia().add(medico.getHorariosDisponiveis().get(i));
                    System.out.println("O médico " + medico.getNome() + " foi alocado para o trabalho as " + medico.getHorariosDisponiveis().get(i) + " no dia " + agenda.getData());
                   
                }else{
                    System.out.println("Horario fora da agenda");
                    
                }
            }
        }
        agendaRepository.save(agenda);
        System.out.println("Alocações salvas no sistema");
        System.out.println(agenda.getHorariosAutopsia().size());
    }

      public void organizaAgenda(AgendaModel agenda){

        double[] horaiosFiltrados = agenda.getHorariosAutopsia().stream().mapToDouble(Double::doubleValue).toArray();
        Arrays.sort(horaiosFiltrados);

        System.out.println("A agenda ordenada por seus horarios: ");
        System.out.println(Arrays.toString(horaiosFiltrados));
    }

    public void verificaAutopsias(AgendaModel agenda){
        for(int i = 0; i < agenda.getHorariosAutopsia().size(); i++){
            if(i < agenda.getNumDeCorpos()){
                System.out.println("Relatório: " + i);
                cadaverService.geraRelatorioCadaver();
            }else{
                System.out.println("Numero de cadaveres excedente para autópsias");
            }
        }
    }

}
