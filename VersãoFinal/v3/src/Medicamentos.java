import java.util.Scanner;

public class Medicamentos {
	
	Scanner scan = new Scanner(System.in);
	
	private String[] nome = new String[100];
	private int codigo=-1;
	private int[] quantidadeDisponivel = new int[100]; 
	private int[] quantidadeUtilizada = new int[100];
	private int[] codigoRemedio = new int[100];
	
	public Medicamentos(){
	    
	}
	
	public Medicamentos(String[] nome, int[] quantidadeDisponivel, int[] quantidadeUtilizada, int[] codigoRemedio){
	    this.nome = nome;
	    this.quantidadeDisponivel = quantidadeDisponivel;
	    this.quantidadeUtilizada = quantidadeUtilizada;
	    this.codigoRemedio = codigoRemedio;
	}
	
	public String getNome(int codigo ) {
		return nome[codigo];
	}
	public void setNome(String nome, int codigo) {
		this.nome[codigo] = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidadeDisponivel(int codigo ) {
		return quantidadeDisponivel[codigo];
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel, int codigo) {
		this.quantidadeDisponivel[codigo] = quantidadeDisponivel;
	}
	public int getQuantidadeUtilizada(int codigo) {
		return quantidadeUtilizada[codigo];
	}
	public void setQuantidadeUtilizada(int quantidadeUtilizada, int codigo) {
		this.quantidadeUtilizada[codigo] = quantidadeUtilizada;
	}
	public int getCodigoRemedio(int codigo) {
		return codigoRemedio[codigo];
	}
	public void setCodigoRemedio(int codigoRemedio, int codigo) {
		this.codigoRemedio[codigo] = codigoRemedio;
	}
	
	public  void cadastrarMedicamento(){
        setCodigo(getCodigo()+1);
        
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\tCadastrando Medicamento");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o nome do remédio: ");
		setNome(scan.next(), codigo);
		System.out.println("\nInforme o código do remédio:");
		setCodigoRemedio(scan.nextInt(), codigo);
		System.out.println("\nInforme a quantidade do remédio: ");
		setQuantidadeDisponivel(scan.nextInt(), codigo);
		
	}
	
	public void admininstrarMedicamento() {
		int cod;
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\nAdministrando Medicamento");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o código do remédio:");
		cod = scan.nextInt();
		for(int i = 0; i <10; i++) {
			if(cod == getCodigoRemedio(i)) {
				System.out.println("\nInforme a quantidade utilizada:");
				setQuantidadeUtilizada((getQuantidadeUtilizada(i) + scan.nextInt()), i);
				setQuantidadeDisponivel((getQuantidadeDisponivel(i) - getQuantidadeUtilizada(i)), i);
				break;
            }
        }
    }
}