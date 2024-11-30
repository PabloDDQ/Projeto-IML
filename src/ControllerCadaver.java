import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ControllerCadaver extends Cadaver{
    private List<Cadaver> listaCadaveres = new ArrayList<>();
    private List<String> nomesMasculinos = new ArrayList<>();
    private List<String> nomesFemininos = new ArrayList<>();
    private List<String> sexos = new ArrayList<>();
    private List<String> CPFs = new ArrayList<>();
    private List<String> contatosParente = new ArrayList<>();
    private List<LocalDate> datasNascimento = new ArrayList<>();
    private List<LocalDate> datasFalecimento = new ArrayList<>();
    private List<String> causasDaMorte = new ArrayList<>();
    private List<String> sobrenomes = new ArrayList<>();

//Começa Getter e os Setters
    public List<Cadaver> getListaCadaveres() {
        return listaCadaveres;
    }


    public void setListaCadaveres(List<Cadaver> listaCadaveres) {
        this.listaCadaveres = listaCadaveres;
    }


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


    public List<String> getSexos() {
        return sexos;
    }


    public void setSexos(List<String> sexos) {
        this.sexos = sexos;
    }


    public List<String> getCPFs() {
        return CPFs;
    }


    public void setCPFs(List<String> cPFs) {
        CPFs = cPFs;
    }


    public List<String> getContatosParente() {
        return contatosParente;
    }


    public void setContatosParente(List<String> contatosParente) {
        this.contatosParente = contatosParente;
    }


    public List<LocalDate> getDatasNascimento() {
        return datasNascimento;
    }


    public void setDatasNascimento(List<LocalDate> datasNascimento) {
        this.datasNascimento = datasNascimento;
    }


    public List<LocalDate> getDatasFalecimento() {
        return datasFalecimento;
    }


    public void setDatasFalecimento(List<LocalDate> datasFalecimento) {
        this.datasFalecimento = datasFalecimento;
    }


    public List<String> getCausasDaMorte() {
        return causasDaMorte;
    }


    public void setCausasDaMorte(List<String> causasDaMorte) {
        this.causasDaMorte = causasDaMorte;
    }


    public List<String> getSobrenomes() {
        return sobrenomes;
    }


    public void setSobrenomes(List<String> sobrenomes) {
        this.sobrenomes = sobrenomes;
    }


    //Começa a adicionar os itens das listas
    public void adicionaNomeMasculino(){
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
    

    public void adicionaNomeFeminino(){
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


    public void adicionaSobrenome(){
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

    public void adicionaCausaDaMorte(){
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

    public void adicionaSexo(){
        sexos.add("Masculino");
        sexos.add("Feminino");
    }

    public void adicionaCPF(Random random){
        for(int i = 0; i <=50; i++){
            CPFs.add(sorteiaCPF(random));
        }
    }

    public void adiconaContato(Random random){
        for(int i = 0; i < 50; i++){
            contatosParente.add(sorteiaContato(random));
        }
    }

    public void adicionaDatanascimento(Random random){
        LocalDate inicio = LocalDate.of(1980, 1, 1);
        LocalDate fim = LocalDate.of(2010, 12, 12);

        int duracaoDias = (int) (fim.toEpochDay() - inicio.toEpochDay());

        for(int i = 0; i <20; i++){
            long diasAleatorios = random.nextInt(duracaoDias + 1);
            LocalDate dataAleatoria = inicio.plusDays(diasAleatorios);
            datasNascimento.add(dataAleatoria);
        }
    }

    public void adicionaDataFalecimento(Random random){
        LocalDate inicio = LocalDate.of(2015, 1, 1);
        LocalDate fim = LocalDate.of(2025, 12, 12);

        int duracaoDias = (int) (fim.toEpochDay() - inicio.toEpochDay());

        for(int i = 0; i <20; i++){
            long diasAleatorios = random.nextInt(duracaoDias + 1);
            LocalDate dataAleatoria = inicio.plusDays(diasAleatorios);
            datasFalecimento.add(dataAleatoria);
        }
    }

    //Sorteia as informações salvas nas listas 
    public String sorteiaNome(Random random){
        int sorteador;

        if(getSexo() == "Masculino"){
            sorteador = random.nextInt(nomesMasculinos.size());

            String nomeMasculino = nomesMasculinos.get(sorteador);
            
            return nomeMasculino;
        }else{
            sorteador = random.nextInt(nomesFemininos.size());

            String nomeFeminino = nomesFemininos.get(sorteador);
            
            return nomeFeminino;
        }
    }

    public String sorteiaSexo(Random random){
        int sorteador = random.nextInt(sexos.size());

        String sexoEscolhido = sexos.get(sorteador);
       
        return sexoEscolhido;

    }

    public static String sorteiaCPF(Random random){
        int num1 = random.nextInt(900) + 100;
        int num2 = random.nextInt(900) + 100;
        int num3 = random.nextInt(900) + 100;
        int dig1 = random.nextInt(90) + 10; // Garante um número de 2 dígitos

        return String.format("%03d.%03d.%03d-%02d", num1, num2, num3, dig1);

    }

    public static String sorteiaContato(Random random){
        int ddd = random.nextInt(90) + 10;
        int parte1 = random.nextInt(9000) + 1000;
        int parte2 = random.nextInt(10000);

        return String.format("(%d2) 9%04d-%404d", ddd, parte1, parte2);
    }

    public LocalDate sorteiaDataNascimento(Random random){
        int sorteador = random.nextInt(datasNascimento.size());

        LocalDate dataNascEscolhida = datasNascimento.get(sorteador);
        
        return dataNascEscolhida;
    }

    public LocalDate sorteiaDataFalecimento(Random random){
        int sorteador = random.nextInt(datasFalecimento.size());

        LocalDate dataFaleccEscolhida = datasFalecimento.get(sorteador);
       
        return dataFaleccEscolhida;
    }

    public String sorteiaCausaMorte(Random random){
        int sorteador = random.nextInt(causasDaMorte.size());

        String cauaMorteEscolhida = causasDaMorte.get(sorteador);
        
        return cauaMorteEscolhida;
    }


    public String sorteiaSobrenome(Random random){
        int sorteador = random.nextInt(sobrenomes.size());

        String sobrenomeEscolhido = sobrenomes.get(sorteador);
        return sobrenomeEscolhido; 
    }

    // Criação do Cadaver

    public void cadastroCadaver(Random random){
        if(isRealizouAutopsia() == true){
            Cadaver cadaver = new Cadaver(1, true, sorteiaNome(random), sorteiaSobrenome(random), sorteiaSexo(random), sorteiaCPF(random), sorteiaContato(random), sorteiaDataNascimento(random), sorteiaDataFalecimento(random), sorteiaCausaMorte(random), false, "Cemitério Rodsa das graças");
        }
    }

}