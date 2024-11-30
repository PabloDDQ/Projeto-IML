import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerAgenda extends Agenda {
    private List<Agenda> listaAgenda;


    public List<Agenda> getListaAgenda() {
        return listaAgenda;
    }

    public void setListaAgenda(List<Agenda> listaAgenda) {
        this.listaAgenda = listaAgenda;
    }


    public void cadastraAgenda(Scanner scanner){
        Agenda agenda = new Agenda();
        ControllerCadaver controllerCadaver = new ControllerCadaver();

        System.out.println("Digite o dia no qual a agenda está sendo feita (no formato ANO/MES/DIA):");
        LocalDate diaEscolhido = LocalDate.of(scanner.nextInt(), scanner.nextInt(),scanner.nextInt());

        agenda.setDia(diaEscolhido);

        System.out.println("Digite o numero de corpos a serem autopsiados no dia:");
        int numeroDeCorpos = scanner.nextInt();
        List<Cadaver> listaCadaveresRef = new ArrayList<>(numeroDeCorpos);
        agenda.getCadaver().setListaCadaveres(listaCadaveresRef);
    }

}
