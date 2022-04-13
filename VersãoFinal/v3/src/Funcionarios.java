
public class Funcionarios extends Pessoa{
	
	private String[] diaSemanaAtendimento = new String[10];
	private float[] salario = new float[10];
	private int id;
	
	public Funcionarios(){
	    
	}
	
	public String getDiaSemanaAtendimento(int id) {
		return diaSemanaAtendimento[id];
	}
	public void setDiaSemanaAtendimento(String diaSemanaAtendimento, int id) {
		this.diaSemanaAtendimento[id] = diaSemanaAtendimento;
	}
	public float getSalario(int id) {
		return salario[id];
	}
	public void setSalario(float salario, int id) {
		this.salario[id] = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void cadastro(){
	    
	}
	public void excluirCadastro(){
	    
	}
	public void listaAtendimento(){
	    
	}
	public void atenderPaciente(){
	    
	}
}
