import java.util.Scanner;

public class Endereco{
	
	Scanner scan = new Scanner(System.in);

    private String[] pais = new String[10];
	private String[] estado = new String[10];
	private String[] cidade = new String[10];
	private String[] bairro = new String[10];
	private String[] rua = new String[10];
	private int[] numero = new int[10];
	private String[] complemento = new String[10];
	
	public Endereco(){
	    
	}

	public String getPais(int id) {
		return pais[id];
	}
	public void setPais(String pais, int id) {
		this.pais[id] = pais;
	}
	public String getEstado(int id) {
		return estado[id];
	}
	public void setEstado(String estado, int id) {
		this.estado[id] = estado;
	}
	public String getCidade(int id) {
		return cidade[id];
	}
	public void setCidade(String cidade, int id) {
		this.cidade[id] = cidade;
	}
	public String getBairro(int id) {
		return bairro[id];
	}
	public void setBairro(String bairro, int id) {
		this.bairro[id] = bairro;
	}
	public String getRua(int id) {
		return rua[id];
	}
	public void setRua(String rua, int id) {
		this.rua[id] = rua;
	}
	public int getNumero(int id) {
		return numero[id];
	}
	public void setNumero(int numero, int id) {
		this.numero[id] = numero;
	}
	public String getComplemento(int id) {
		return complemento[id];
	}
	public void setComplemento(String complemento, int id) {
		this.complemento[id] = complemento;
	}
	
	public void preencherEndereco(int id) {
	    
	    System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	    System.out.println("\tPreenchendo endereço");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe seu país: ");
		setPais(scan.nextLine(), id);
		System.out.println("\nInforme seu estado: ");
		setEstado(scan.nextLine(), id);
		System.out.println("\nInforme sua cidade: ");
		setCidade(scan.nextLine(), id);
		System.out.println("\nInforme seu bairro: ");
		setBairro(scan.nextLine(), id);
		System.out.println("\nInforme a rua: ");
		setRua(scan.nextLine(), id);
		System.out.println("\nInforme o número: ");
		setNumero(scan.nextInt(), id);
		System.out.println("\nComplemento: ");
		scan.nextLine();
		setComplemento(scan.nextLine(), id);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
	}
	
}
