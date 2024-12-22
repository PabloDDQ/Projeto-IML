package br.com.projetoiml.demo_sisteama_iml.Model;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class AgendaModel {

    @Id
    private String data;
    private Double horarioIncio;
    private Double horarioFinal;

    @OneToMany(cascade = CascadeType.ALL)
    private List<MedicoModel> medicosAlocados = new ArrayList<>();

   
    @ElementCollection
    private List<Double> horariosAutopsia = new ArrayList<>();
    private int numDeCorpos;
    
    public AgendaModel(String data, Double horarioIncio, Double horarioFinal, List<MedicoModel> medicosAlocados,
            List<Double> horariosAutopsia, int numDeCorpos) {
        this.data = data;
        this.horarioIncio = horarioIncio;
        this.horarioFinal = horarioFinal;
        this.medicosAlocados = medicosAlocados;
        this.horariosAutopsia = horariosAutopsia;
        this.numDeCorpos = numDeCorpos;
    }



    public AgendaModel(){

    }
    
  

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Double getHorarioIncio() {
        return horarioIncio;
    }
    public void setHorarioIncio(Double horarioIncio) {
        this.horarioIncio = horarioIncio;
    }
    public Double getHorarioFinal() {
        return horarioFinal;
    }
    public void setHorarioFinal(Double horarioFinal) {
        this.horarioFinal = horarioFinal;
    }
    public List<MedicoModel> getMedicosAlocados() {
        return medicosAlocados;
    }
    public void setMedicosAlocados(List<MedicoModel> medicosAlocados) {
        this.medicosAlocados = medicosAlocados;
    }
    public List<Double> getHorariosAutopsia() {
        return horariosAutopsia;
    }
    public void setHorariosAutopsia(List<Double> horariosAutopsia) {
        this.horariosAutopsia = horariosAutopsia;
    }
    public int getNumDeCorpos() {
        return numDeCorpos;
    }
    public void setNumDeCorpos(int numDeCorpos) {
        this.numDeCorpos = numDeCorpos;
    }
}
