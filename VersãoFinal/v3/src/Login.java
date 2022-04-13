import java.util.Scanner;

public class Login {
	
	Scanner scan = new Scanner(System.in);
	private String usuario;
	private int senha;
	
	public Login(){}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int logar() {
		System.out.println("[Pressione Enter]");
        scan.nextLine();
		
		limpaTela();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\tLoguin");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Informe o usuario:");
		setUsuario(scan.nextLine());
		System.out.println("Informe a senha:");
		setSenha(scan.nextInt());
		
		if(this.senha == 111) {
			return 1;
			
		}else if(this.senha == 222) {
			return 2;
			
		}else if(this.senha == 333) {
			return 3;
			
		}else if(this.senha == 444){
			return 4;
		}else {
			System.out.println("login invalido! senha: " + getSenha());
			
			return 0;
		}
		
	}
	public static void limpaTela(){
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
}
