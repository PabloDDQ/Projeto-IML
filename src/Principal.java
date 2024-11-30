import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    static List<Medico> listaMedicos = new ArrayList<>();
    static List<Double> listaHorariosDisponiveis = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ControllerMedicos controller = new ControllerMedicos();
        controller.loopMedico(scanner, listaMedicos);
    }
}
