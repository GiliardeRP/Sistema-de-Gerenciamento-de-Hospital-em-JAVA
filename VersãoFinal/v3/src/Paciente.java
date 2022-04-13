import java.util.Scanner;

public class Paciente extends Pessoa{
	
	Scanner scan = new Scanner(System.in);
	
	private String[] status = new String[10];
	private String[] nomeCovenioMedico = new String[10];
	private String[] medicacaoReceitada = new String[20];
	private String[] examePedido = new String[10];
	private String[] diagnostico = new String[20];
	private double[] altura = new double[10];
	private double[] peso = new double[10];
	private long[] matriculaCovenio = new long[10];
	private int[] controle = new int[10];
	private int inicioFila=-1, fimFila=-1;
	private int idPaciente=0;
	
	public Paciente() {
			
	}
	
    public String getStatus(int idPaciente) {
		return status[idPaciente];
	}
	public void setStatus(String status, int idPaciente) {
		this.status[idPaciente] = status;
	}	
	public String getNomeCovenioMedico(int idPaciente) {
		return nomeCovenioMedico[idPaciente];
	}
	public void setNomeCovenioMedico(String nomeCovenioMedico, int idPaciente) {
		this.nomeCovenioMedico[idPaciente] = nomeCovenioMedico;
	}	
	public String getMedicacaoReceitada(int idPaciente) {
		return medicacaoReceitada[idPaciente];
	}
	public void setMedicacaoReceitada(String medicacaoReceitada, int idPaciente) {
		this.medicacaoReceitada[idPaciente] = medicacaoReceitada;
	}	
	public String getExamePedido(int idPaciente) {
		return examePedido[idPaciente];
	}
	public void setExamePedido(String examePedido, int idPaciente) {
		this.examePedido[idPaciente] = examePedido;
	}					
	public String getDiagnostico(int idPaciente) {
		return diagnostico[idPaciente];
	}
	public void setDiagnostico(String diagnostico, int idPaciente) {
		this.diagnostico[idPaciente] = diagnostico;
	}   
	public double getAltura(int idPaciente) {
		return altura[idPaciente];
	}
	public void setAltura(double altura, int idPaciente) {
		this.altura[idPaciente] = altura;
	}
	public double getPeso(int idPaciente) {
		return peso[idPaciente];
	}
	public void setPeso(double peso, int idPaciente) {
		this.peso[idPaciente] = peso;
	}
	public long getMatriculaCovenio(int idPaciente) {
	    return matriculaCovenio[idPaciente];
	}
	public void setMatriculaCovenio(long matriculaCovenio, int idPaciente) {
		this.matriculaCovenio[idPaciente] = matriculaCovenio;
	}
    public int getControle(int idPaciente) {
		return controle[idPaciente];
	}
	public void setControle(int controle, int idPaciente) {
		this.controle[idPaciente] = controle;
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
	public int getIdPaciente() {
			return idPaciente;
		}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public void cadastro() {
		
		if(getFimFila() == 9) {
			System.out.println("Impossíel adicionar paciente, excluia um cadastro primeiro!");
		}
		else {
		   
		    
            System.out.println("[Pressione Enter]");
            scan.nextLine();
            limpaTela();
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\tCadastrando Paciente");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Informe o nome:");
			setNome(scan.nextLine(), idPaciente);
			System.out.println("\nInforme o cpf:     \nEX: 'XXX.XXX.XXX-XX'");
			setCpf(scan.nextLine(), idPaciente);
			System.out.println("\nInforme a data de nacimento: \nEX: 'XX/XX/XXXX'");
			setDataNascimento(scan.nextLine(), idPaciente);
			System.out.println("\nInforme o sexo: \nEX: 'M' ou 'F'");
			setSexo(scan.nextLine().charAt(0), idPaciente);
			System.out.println("\nNúmero para contato:");
			setTelefone(scan.nextLine(), idPaciente);
			System.out.println("\nStatus do paciente: ");
			setStatus(scan.nextLine(), idPaciente);
			System.out.println("\nInforme a altura:  \nEX:'1,57'");
			setAltura(scan.nextDouble(), idPaciente);
			System.out.println("\nInforme o peso K/l:");
			setPeso(scan.nextDouble(), idPaciente);
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("O paciente possui convénio médico? 'S' ou 'N'");
			char resp; 
			resp = scan.next().charAt(0);
			
			if(resp == 'S' || resp == 's'){
                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("\nInforme o nome do covênio médico: ");
                scan.nextLine();
                setNomeCovenioMedico(scan.nextLine(), idPaciente);
                System.out.println("\nInforme a matricula do covênio: ");
                setMatriculaCovenio(scan.nextLong(), idPaciente);
			} 
            setFimFila(getFimFila()+1);
            setIdPaciente(getIdPaciente()+1);
            
            if(this.idPaciente==1) {
                setInicioFila(0);
			}
			else{
			    setInicioFila(getInicioFila()+1);
			}
			
			preencherEndereco(idPaciente); 
        }
	}
	
	public void excluirCadastro() {
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Paciente: "+getNome(idPaciente)+" foi removido(a) do sistema.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if(getInicioFila() == 0 && getFimFila()==0){
            setInicioFila(getInicioFila()-1);
            setFimFila(getFimFila()-1);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
            System.out.println("[Pressione Enter]");
            scan.nextLine();
            limpaTela();
        }
        else{
            setInicioFila(getInicioFila()+1);
        }
    }
    
    public static void limpaTela(){
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
}