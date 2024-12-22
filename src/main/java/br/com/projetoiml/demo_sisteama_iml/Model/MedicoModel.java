package br.com.projetoiml.demo_sisteama_iml.Model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class MedicoModel {
    @Id
    private String crm;

    private String nome;

   @ElementCollection
    private List<Double> horariosDisponiveis = new ArrayList<>();


    public MedicoModel(){
    }
    
    public MedicoModel(String crm, String nome, List<Double> horariosDisponiveis) {
    this.crm = crm;
    this.nome = nome;
    this.horariosDisponiveis = horariosDisponiveis;
}

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    public void setHorariosDisponiveis(List<Double> horariosDisponiveis) {
        this.horariosDisponiveis = horariosDisponiveis;
    }




}
