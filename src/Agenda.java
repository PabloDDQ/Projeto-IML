import java.time.LocalDate;

public class Agenda extends Turno{
    private LocalDate dia;
    private double horarioAutopsia;
    private ControllerMedicos medico;
    private ControllerCadaver cadaver;
   
   
    public LocalDate getDia() {
        return dia;
    }
    public void setDia(LocalDate dia) {
        this.dia = dia;
    }
    public double getHorarioAutopsia() {
        return horarioAutopsia;
    }
    public void setHorarioAutopsia(double horarioAutopsia) {
        this.horarioAutopsia = horarioAutopsia;
    }
    public ControllerMedicos getMedico() {
        return medico;
    }
    public void setMedico(ControllerMedicos medico) {
        this.medico = medico;
    }
    public ControllerCadaver getCadaver() {
        return cadaver;
    }
    public void setCadaver(ControllerCadaver cadaver) {
        this.cadaver = cadaver;
    }



}
