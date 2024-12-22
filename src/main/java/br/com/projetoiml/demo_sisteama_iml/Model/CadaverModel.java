package br.com.projetoiml.demo_sisteama_iml.Model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class CadaverModel {

    private static int contador = 0;
    @Id
    private String id;
    
    private boolean realizouAutopsia;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String CPF;
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;
    private String causaDaMorte;
    private String localExumacao;
    
    public CadaverModel(){
        this.id = String.format("C%03d", ++contador);
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public boolean isRealizouAutopsia() {
        return realizouAutopsia;
    }
    public void setRealizouAutopsia(boolean realizouAutopsia) {
        this.realizouAutopsia = realizouAutopsia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getDataFalecimento() {
        return dataFalecimento;
    }
    public void setDataFalecimento(LocalDate dataFalecimento) {
        this.dataFalecimento = dataFalecimento;
    }
    public String getCausaDaMorte() {
        return causaDaMorte;
    }
    public void setCausaDaMorte(String causaDaMorte) {
        this.causaDaMorte = causaDaMorte;
    }
    public String getLocalExumacao() {
        return localExumacao;
    }
    public void setLocalExumacao(String localExumacao) {
        this.localExumacao = localExumacao;
    }
    

    
   
}
