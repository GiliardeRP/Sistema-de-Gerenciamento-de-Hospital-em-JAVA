import java.util.Scanner;

public class Pessoa extends Endereco{
	
	Scanner scan = new Scanner(System.in); 
	
	private String[] nome = new String[10];
	private String[] cpf = new String[10];
	private String[] dataNascimento = new String[10];
	private String[] telefone = new String[10];
	private char[] sexo = new char[10];
	
	
	public Pessoa(){
	    
	}
	
	public String getNome(int id) {
		return nome[id];
	}
	public void setNome(String nome, int id){
		this.nome[id] = nome;
	}
	public String getCpf(int id) {
		return cpf[id];
	}
	public void setCpf(String cpf, int id) {
		this.cpf[id] = cpf;
	}
	public String getDataNascimento(int id) {
		return dataNascimento[id];
	}
	public void setDataNascimento(String dataNascimento, int id) {
		this.dataNascimento[id] = dataNascimento;
	}
	public String getTelefone(int id) {
		return telefone[id];
	}
	public void setTelefone(String telefone, int id) {
		this.telefone[id] = telefone;
	}
	public char getSexo(int id) {
		return sexo[id];
	}
	public void setSexo(char sexo, int id) {
		this.sexo[id] = sexo;
	}
	
	public void cadastro() {
		
	}
	
}