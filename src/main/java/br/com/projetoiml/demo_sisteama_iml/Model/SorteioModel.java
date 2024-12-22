package br.com.projetoiml.demo_sisteama_iml.Model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SorteioModel {
    private List<String> nomesMasculinos = new ArrayList<>();
    private List<String> nomesFemininos = new ArrayList<>();
    private List<String> sobrenomes = new ArrayList<>();
    private List<String> causasDaMorte = new ArrayList<>();

    public SorteioModel(List<String> nomesMasculinos, List<String> nomesFemininos, List<String> sobrenomes,
        List<String> causasDaMorte) {

        adicionaNomeMasculino(nomesMasculinos);
        adicionaNomeFeminino(nomesFemininos);
        adicionaSobrenome(sobrenomes);
        adicionaCausaDaMorte(causasDaMorte);
            
        this.nomesMasculinos = nomesMasculinos;
        this.nomesFemininos = nomesFemininos;
        this.sobrenomes = sobrenomes;
        this.causasDaMorte = causasDaMorte;
    }


    private Random random = new Random();

     public List<String> getNomesMasculinos() {
        return nomesMasculinos;
    }

    public void setNomesMasculinos(List<String> nomesMasculinos) {
        this.nomesMasculinos = nomesMasculinos;
    }

    public List<String> getNomesFemininos() {
        return nomesFemininos;
    }

    public void setNomesFemininos(List<String> nomesFemininos) {
        this.nomesFemininos = nomesFemininos;
    }

    public List<String> getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(List<String> sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public List<String> getCausasDaMorte() {
        return causasDaMorte;
    }

    public void setCausasDaMorte(List<String> causasDaMorte) {
        this.causasDaMorte = causasDaMorte;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    //Começa a adicionar os itens das listas
     public void adicionaNomeMasculino(List<String> nomesMasculinos){
        nomesMasculinos.add("Carlos");
        nomesMasculinos.add("Paulo");
        nomesMasculinos.add("Ricardo");
        nomesMasculinos.add("Lucas");
        nomesMasculinos.add("André");
        nomesMasculinos.add("Pedro");
        nomesMasculinos.add("Rafael");
        nomesMasculinos.add("Gustavo");
        nomesMasculinos.add("Felipe");
        nomesMasculinos.add("Diego");
        nomesMasculinos.add("João");
        nomesMasculinos.add("Bruno");
        nomesMasculinos.add("Caio");
        nomesMasculinos.add("Eduardo");
        nomesMasculinos.add("Henrique");
        nomesMasculinos.add("Igor");
        nomesMasculinos.add("Leonardo");
        nomesMasculinos.add("Marcelo");
        nomesMasculinos.add("Thiago");
        nomesMasculinos.add("Victor");
    }

    public void adicionaNomeFeminino(List<String> nomesFemininos){
        nomesFemininos.add("Mariana");
        nomesFemininos.add("Fernanda");
        nomesFemininos.add("Juliana");
        nomesFemininos.add("Bianca");
        nomesFemininos.add("Letícia");
        nomesFemininos.add("Camila");
        nomesFemininos.add("Vanessa");
        nomesFemininos.add("Larissa");
        nomesFemininos.add("Ana");
        nomesFemininos.add("Sofia");
        nomesFemininos.add("Gabriela");
        nomesFemininos.add("Alice");
        nomesFemininos.add("Beatriz");
        nomesFemininos.add("Carla");
        nomesFemininos.add("Daniela");
        nomesFemininos.add("Eduarda");
        nomesFemininos.add("Fabiana");
        nomesFemininos.add("Helena");
        nomesFemininos.add("Isabela");
        nomesFemininos.add("Julia");
    }

    public void adicionaSobrenome(List<String> sobrenomes){
        sobrenomes.add("Silva");
        sobrenomes.add("Santos");
        sobrenomes.add("Oliveira");
        sobrenomes.add("Pereira");
        sobrenomes.add("Ferreira");
        sobrenomes.add("Costa");
        sobrenomes.add("Rodrigues");
        sobrenomes.add("Almeida");
        sobrenomes.add("Nogueira");
        sobrenomes.add("Gomes");
        sobrenomes.add("Barbosa");
        sobrenomes.add("Sousa");
        sobrenomes.add("Martins");
        sobrenomes.add("Ribeiro");
        sobrenomes.add("Fernandes");
        sobrenomes.add("Carvalho");
        sobrenomes.add("Moura");
        sobrenomes.add("Melo");
        sobrenomes.add("Andrade");
        sobrenomes.add("Araujo");
    }

    public void adicionaCausaDaMorte(List<String> causasDaMorte){
        causasDaMorte.add("Infarto");
        causasDaMorte.add("Acidente de trânsito");
        causasDaMorte.add("Afogamento");
        causasDaMorte.add("Câncer");
        causasDaMorte.add("Acidente vascular cerebral (AVC)");
        causasDaMorte.add("Insuficiência respiratória");
        causasDaMorte.add("Infecção generalizada (Septicemia)");
        causasDaMorte.add("Doença cardíaca");
        causasDaMorte.add("Cirrose hepática");
        causasDaMorte.add("Doença renal crônica");
        causasDaMorte.add("Complicações do diabetes");
        causasDaMorte.add("Pneumonia");
        causasDaMorte.add("Hemorragia interna");
        causasDaMorte.add("Trauma craniano");
        causasDaMorte.add("Suicídio");
        causasDaMorte.add("Queda acidental");
        causasDaMorte.add("Parada cardiorrespiratória");
        causasDaMorte.add("Intoxicação por drogas");
        causasDaMorte.add("Anemia grave");
        causasDaMorte.add("Desidratação severa");
    }

 
    public CadaverModel sorteioCadaver(CadaverModel cadaver) {
        

        // Sorteia o sexo
        String sexo = random.nextBoolean() ? "Masculino" : "Feminino";
        cadaver.setSexo(sexo);

        // Sorteia o nome baseado no sexo
        String nome;
        if(sexo == "Masculino"){
            nome = nomesMasculinos.get(random.nextInt(nomesMasculinos.size()));
        }else{
            nome = nomesFemininos.get(random.nextInt(nomesFemininos.size()));
        }
               
        cadaver.setNome(nome);

        // Sorteia o sobrenome
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        cadaver.setSobrenome(sobrenome);

        // Gera CPF aleatório (simplificado)
        String cpf = String.format("%03d.%03d.%03d-%02d",
                random.nextInt(1000), random.nextInt(1000), random.nextInt(1000), random.nextInt(100));
        cadaver.setCPF(cpf);

        // Gera uma data de nascimento aleatória nos últimos 100 anos
        LocalDate dataNascimento = LocalDate.now().minusYears(18 + random.nextInt(82));
        cadaver.setDataNascimento(dataNascimento);

        // Gera uma data de falecimento após a data de nascimento
        LocalDate dataFalecimento = dataNascimento.plusDays(1 + random.nextInt(365 * (2023 - dataNascimento.getYear())));
        cadaver.setDataFalecimento(dataFalecimento);

        // Sorteia a causa da morte
        String causaDaMorte = causasDaMorte.get(random.nextInt(causasDaMorte.size()));
        cadaver.setCausaDaMorte(causaDaMorte);


        // Define o local de exumação (pode ser adaptado)
        String localExumacao = "Cemitério Municipal " + (1 + random.nextInt(10));
        cadaver.setLocalExumacao(localExumacao);

        // Determina se realizou autópsia
        boolean realizouAutopsia = random.nextBoolean();
        cadaver.setRealizouAutopsia(realizouAutopsia);

        return cadaver;
    }


}
