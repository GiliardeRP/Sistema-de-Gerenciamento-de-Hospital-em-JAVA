
public class Enfermeiro extends Funcionarios{
	
	private Paciente paciente;
	private int idEnfermeiro=-1;
	private int inicioFila=-1, fimFila=-1;
	private int controle2;
	private Medicamentos remed;
	private Medicos medico;
	
	public Enfermeiro(){
	    
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public int getIdEnfermeiro(){
	    return this.idEnfermeiro;
	}
	public void setIdEnfermeiro(int idEnfermeiro){
	    this.idEnfermeiro = idEnfermeiro;
	}
	public int getInicioFila() {
		return inicioFila;
	}
	public void setInicioFila(int inicioFila) {
		this.inicioFila = inicioFila;
	}
	public int getFimFila() {
		return fimFila;
	}
	public void setFimFila(int fimFila) {
		this.fimFila = fimFila;
	}
	public int getControle2(){
	    return controle2;
	}
	public void setControle2(int controle2){
	    this.controle2 = controle2;
	}
	public Medicamentos getRemid() {
		return remed;
	}
	public void setRemid(Medicamentos remed) {
		this.remed = remed;
	}
	public Medicos getMedico(){
	    return medico;
	}
	public void setMedico(Medicos medico){
	    this.medico = medico;
	}
	
	public void cadastro() {
		setIdEnfermeiro(getIdEnfermeiro()+1);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tCadastrando Enfermeiro");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o nome:");
		setNome(scan.nextLine(), idEnfermeiro);
		
		System.out.println("\nInforme o cpf:     \nEX: 'XXX.XXX.XXX-XX'");
		setCpf(scan.nextLine(), idEnfermeiro);
		
		System.out.println("\nInforme a data de nascimento: \nEX: 'XX/XX/XXXX'");
		setDataNascimento(scan.nextLine(), idEnfermeiro);
		
		System.out.println("\nInforme o sexo: \nEX: 'M' ou 'F'");
		setSexo(scan.nextLine().charAt(0), idEnfermeiro);
		
		System.out.println("\nInforme o número para contato:");
		setTelefone(scan.nextLine(),idEnfermeiro);
		
		System.out.println("\nInforme os dias de atendimento: \nEX: 'segunda-quarta-sexta'");
		setDiaSemanaAtendimento(scan.nextLine(),idEnfermeiro);
		
		System.out.println("\nInforme o salário: ");
		setSalario(scan.nextFloat(),idEnfermeiro);
		
		preencherEndereco(idEnfermeiro); 
		
	}
	
	public void excluirCadastro() {
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enfermeiro(a): "+getNome(idEnfermeiro)+" foi removido(a) do sistema.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		setInicioFila(getInicioFila()+1);
	}
	
	public void listaAtendimento(Paciente paciente) {
		int j = paciente.getInicioFila();
		
		if(paciente.getInicioFila() == -1) {
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tListando Pacientes");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("A lista está vazia!");
			System.out.println("______________________________\n\n");
			System.out.println("[Pressione Enter]");
            scan.nextLine();
            scan.nextLine();
            limpaTela();
		}
		else {
		    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tListando Pacientes");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            for(int i = 0; i < paciente.getFimFila()+1; i++){
			System.out.println("Paciente: " + i +" Nome: " + paciente.getNome(j) 
				+" Altura: "+ paciente.getAltura(j) 
				+" Peso: "+ paciente.getPeso(j) 
				+" Sexo: "+ paciente.getSexo(j) 
				+" Status: "+ paciente.getStatus(j));
				j++;
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("[Pressione Enter]");
            scan.nextLine();
            limpaTela();
		}
	}
	
	public void atenderPaciente(Paciente paciente, Medicamentos remed, Medicos medico) {
		setControle2(paciente.getInicioFila());
		
		if(getControle2() == -1) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tAtendendo Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Não há pacientes para atender!");
			System.out.println("____________________________________");
			System.out.println("[Pressione Enter]");
            scan.nextLine();
            limpaTela();
        }
		else{
            for(int i = -1; i < paciente.getFimFila()+1; i++){
            
                System.out.println("Paciente: "  + paciente.getNome(getControle2()) 
                    +" Altura: "+ paciente.getAltura(getControle2()) 
                    +" Peso: "+ paciente.getPeso(getControle2()) 
                    +" Sexo: "+ paciente.getSexo(getControle2()));
                System.out.println("Diagnostico previo: " + paciente.getDiagnostico(medico.getControle3()));
                System.out.println("Precisa ser adiministrada a seguinte medicação: ");
                System.out.println(paciente.getMedicacaoReceitada(medico.getControle3()));
                
                remed.admininstrarMedicamento();
                
                System.out.println("Solicitar alta para o paciente ou ir para o próximo ?\n1_Solicitar alta.\n2_Ir para o próximo.\n3_Sair.");
                int j;
                j = scan.nextInt();
                if(j==1) {
                    medico.darAlta(paciente);
                    break;
                }
                else if(j==2){
                    setControle2(getControle2()+1);
                }
                else if(j==3) {
                	break;
                }
            }
		}	
		
	}
	
	public static void limpaTela(){
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}