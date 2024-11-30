import java.time.LocalDate;

public class Cadaver {
    private int id;
    private boolean realizouAutopsia;
    private String nome;
    private String sobrenome;
    private String sexo;
    private String CPF;
    private String contato;
    private LocalDate dataNascimento;
    private LocalDate dataFalecimento;
    private String causaDaMorte;
    private boolean doadorOrgaos;
    private String localExumacao;
    
    
    
    public Cadaver(int id, boolean realizouAutopsia, String nome, String sobrenome, String sexo, String cPF,
            String contato, LocalDate dataNascimento, LocalDate dataFalecimento, String causaDaMorte,
            boolean doadorOrgaos, String localExumacao) {
        this.id = id;
        this.realizouAutopsia = realizouAutopsia;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        CPF = cPF;
        this.contato = contato;
        this.dataNascimento = dataNascimento;
        this.dataFalecimento = dataFalecimento;
        this.causaDaMorte = causaDaMorte;
        this.doadorOrgaos = doadorOrgaos;
        this.localExumacao = localExumacao;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
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
    public boolean isDoadorOrgaos() {
        return doadorOrgaos;
    }
    public void setDoadorOrgaos(boolean doadorOrgaos) {
        this.doadorOrgaos = doadorOrgaos;
    }
    public String getLocalExumacao() {
        return localExumacao;
    }
    public void setLocalExumacao(String localExumacao) {
        this.localExumacao = localExumacao;
    }
    

    
   
}
