import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Medico {
    public String nome;
    public String sobrenome;
    public String cargo;
    public String CFM;
    public double horario;
    public List<Double> listaHorariosDisponiveis = new ArrayList<>() ;
    public int escolha;

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
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCFM() {
        return CFM;
    }
    public void setCFM(String cFM) {
        CFM = cFM;
    }

    public List<Double> getListaHorariosDisponiveis() {
        return listaHorariosDisponiveis;
    }

    public void setListaHorariosDisponiveis(List<Double> listaHorariosDisponiveis) {
        this.listaHorariosDisponiveis = listaHorariosDisponiveis;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public void cadastroHorarios(Scanner scanner, List<Double> listalistaHorariosDisponiveis){
        escolha =  1;
        scanner.nextLine();

        while (escolha != 0) {
            System.out.println("Digite o horario em que o médico estará disponivel(estando disponivel por 1 hora a partir do horario indicado): ");
            horario = scanner.nextDouble();
            listaHorariosDisponiveis.add(horario);

            System.out.println("Quer cadastrar mais horarios: (1)SIM (0)NÃO");
            escolha = scanner.nextInt();
        }
        
    }    

    public void cadastro(Scanner scanner){
        System.out.println("Digite o numero CFM do médico: ");
        CFM = scanner.nextLine();

        System.out.println("Digite o nome do médico");
        nome = scanner.nextLine();

        System.out.println("Digite o sobrenome do médico: ");
        sobrenome = scanner.nextLine();

        System.out.println("Digite o cargo do médico: ");
        cargo = scanner.nextLine();

        cadastroHorarios(scanner,listaHorariosDisponiveis);
        
        System.out.println("CADASTRO REALIZADO COM SUCESSO");
    }

    public void exibir(){
        System.out.println("-----------------------------------------------------");
        System.out.println("CFM: " + CFM);
        System.out.println("NOME COMPLETO: " + nome + " " + sobrenome);
        System.out.println("CARGO: " + cargo);
        for(int i = 0; i< listaHorariosDisponiveis.size(); i++){
        System.out.println("HORARIOS DISPONIVEIS: "+ listaHorariosDisponiveis.get(i));
        }
        System.out.println("------------------------------------------------------");
    }
}


