import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerMedicos extends Medico{
    private Medico medicos;
    private List<Medico> listaMedicos = new ArrayList<>();

    public Medico getMedicos() {
        return medicos;
    }
    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }
    public void setMedicos(Medico medicos) {
        this.medicos = medicos;
    }
    public void setListaMedicos(List<Medico> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }


    public void listarMedico(List<Medico> listaMedicos){ // LISTAR OS MEDICOS
        for(Medico x : listaMedicos  ){
            x.exibir();
        }
    }

    public void mudarNomeMedico(Scanner scanner, List<Medico> listaMedicos){  // muda o nome do caba
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        scanner.nextLine();

        for(int i =0; i<listaMedicos.size(); i++){
            if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                listaMedicos.get(i).exibir();
                System.out.println("Digite o novo nome a ser inserido");
                String novoNome = scanner.nextLine();
                listaMedicos.get(i).nome = novoNome;
                System.out.println("Digite o novo sobrenome");
                String novoSobrenome = scanner.nextLine();
                listaMedicos.get(i).sobrenome = novoSobrenome;
                System.out.println("NOME MODIFICADO COM SUCESSO!!");
             }

        }
    }

    public void mudarCargoMedico(Scanner scanner, List<Medico> listaMedicos){           //muda o argo do medico 
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        scanner.nextLine();

        for(int i =0; i<listaMedicos.size(); i++){
            if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                listaMedicos.get(i).exibir();
                System.out.println("Digite o novo cargo do médico: ");
                String novoCargo = scanner.nextLine();
                listaMedicos.get(i).cargo = novoCargo;
                System.out.println("CARGO MODIFICADO COM SUCESSO!!");
             }
        }
    }


    public void mudarCRmMedico(Scanner scanner, List<Medico> listaMedicos){ // muda o CRM do meticu
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        scanner.nextLine();

        for(int i =0; i<listaMedicos.size(); i++){
            if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                listaMedicos.get(i).exibir();
                System.out.println("Digite o novo CRM do médico: ");
                String novoCFM = scanner.nextLine();
                listaMedicos.get(i).CFM = novoCFM;
                System.out.println("CFM MODIFICADO COM SUCESSO!!");
             }
        }
    }

    public void mudarHorarioMedico(Scanner scanner, List<Medico> listaMedicos){ //muda os horario dos medicos
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        scanner.nextLine();

        for(int i =0; i<listaMedicos.size(); i++){
            if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                listaMedicos.get(i).exibir();
                System.out.println("Digite o horario que deseja modificar: ");
                Double horarioBusca = scanner.nextDouble();
                for(int a = 0; a<listaHorariosDisponiveis.size(); a++){
                    if(horarioBusca.equals(listaHorariosDisponiveis.get(a))){
                        System.out.println("Digite o novo horario: ");
                        double novoHorario = scanner.nextDouble();
                        listaHorariosDisponiveis.get(a).valueOf(novoHorario); //Essa porra parece ser a maior gambiarra do mundo, n sei se funciona, mas não fica vermelho ese cu
                        System.out.println("HORARIO MODIFICADO COM SUCESSO!!");
                    }
                }
             }
        }
    }

    public void loopModificacao(Scanner scanner,List<Medico> listaMedicos){
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        scanner.nextLine();

        for(int i =0; i<listaMedicos.size(); i++){
            if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                listaMedicos.get(i).exibir();
                System.out.println("QUAL INFORMAÇÃO DESEJA MODIFICAR: (1)NOME E SOBRENOME (2)CARGO (3)CFM (4)HORARIOS");
                int escolha = scanner.nextInt();
                scanner.nextLine();
                if(escolha == 1){
                    mudarNomeMedico(scanner, listaMedicos);
                    }else if(escolha == 2){
                        mudarCargoMedico(scanner, listaMedicos);
                        }else if(escolha == 3){
                            mudarCRmMedico(scanner, listaMedicos);
                            }else if(escolha == 4){
                                mudarHorarioMedico(scanner, listaMedicos);
                            }
            }
        }
        
    }

    
    
    public void excluiMedico(Scanner scanner, List<Medico> listaMedicos){ // Exclui Medicu
        System.out.println("Digite o CRM do médico que deseja mudar as informações: ");
        String buscaMedico = scanner.nextLine();
        int escolha = 0;
        scanner.nextLine();

        do {

            for(int i =0; i<listaMedicos.size(); i++){
                if(buscaMedico.equals(listaMedicos.get(i).CFM)){
                    listaMedicos.get(i).exibir();
                    System.out.println("DESEJA EXCLUIR ESSE MÉDICO??: (1)SIM (2)NÃO");
                    escolha = scanner.nextInt();
                    if(escolha == 1){
                        listaMedicos.remove(i);
                    }else if(escolha == 2){
                        buscaMedico = scanner.nextLine();
                    }
                 }
            }

        } while (escolha != 1);
        
    }

    public void loopMedico(Scanner scanner,List<Medico> listaMedicos ){ // AQUI A MAGICA ACONTECE, O TAL DO CREU
        System.out.println("OLÁ, VAMOS COMEÇAR!!");
        System.out.println("O QUE DESEJA FAZER??: (1)CRIAR MEDICO (2)LISTAR MEDICOS CADASTRADOS (3)MODIFCAR INFORMAÇÕES DE UM MEDICO (4)DELETAR MEDICO (5)SAIR DO LOOP");
         escolha = scanner.nextInt();
        scanner.nextLine();

        while (escolha != 5) {
            if(escolha == 1){
                Medico medico = new Medico();
                medico.cadastro(scanner);
                listaMedicos.add(medico);

                escolha = teste(scanner);
            }else if(escolha == 2){
                listarMedico(listaMedicos);
                escolha = teste(scanner);
            }else if(escolha == 3){
                loopModificacao(scanner, listaMedicos);

                escolha = teste(scanner);}else if(escolha == 4){
                excluiMedico(scanner, listaMedicos);
                escolha = teste(scanner);
            }
        }
    }

    public int teste(Scanner scanner){
        System.out.println("O QUE DESEJA FAZER??: (1)CRIAR MEDICO (2)LISTAR MEDICOS CADASTRADOS (3)MODIFCAR INFORMAÇÕES DE UM MEDICO (4)DELETAR MEDICO (5)SAIR DO LOOP");            
        System.out.println("DIGITE A NOVA AÇÃO: ");

        return scanner.nextInt();
    }



}
   
