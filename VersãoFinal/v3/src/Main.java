import java.util.Scanner;

public class Main {
	
	public static void limpaTela(){
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}
	
	public static void main (String[] args ) {
		
		Scanner scan = new Scanner(System.in); 
		
		int i=1;
		int i2=1;
		int escolha1;
		
		Paciente paciente = new Paciente();
		Medicos medico = new Medicos();
		Medicamentos remed = new Medicamentos();
		Enfermeiro enfermeiro = new Enfermeiro();
		Login login = new Login();
		
		System.out.println("\n--------------------------");
		System.out.println("\tBem vindo!");
		System.out.println("--------------------------");
		
		while(i2!=0) {
			
			escolha1 = login.logar();
			i=1;
			
			if(escolha1 == 1) {
				
				while(i!=0) {
                    				    
                    limpaTela();
                    
                    System.out.println("Informe o número da opção que deseja abrir:");
                    System.out.println("----------------------------------------------\n");
					System.out.println("1 - Cadastrar paciente;");
					System.out.println("2 - Excluir paciente;");
					System.out.println("3 - Trocar de usuário;");
					System.out.println("4 - Fechar o programa;");
                    
					System.out.println("\n--------------------------");
					System.out.println("Opção escolhida: ");
					escolha1 = scan.nextInt();
					System.out.println("--------------------------");
					
					switch(escolha1) {
						case 1:
                            limpaTela();
                            paciente.cadastro(); 
                            break;
						case 2: 
                            limpaTela();
							paciente.excluirCadastro();
							break;
						case 3:
							i=0;
							limpaTela();
							break;
						case 4:
							i=0;
							i2=0;
							limpaTela();
							break;
					}
				}
			}
			else if(escolha1 == 2) {
				
				while(i!=0) {
				    limpaTela();
				    
                    System.out.println("Informe o número da opção que deseja abrir:");
                    System.out.println("----------------------------------------------\n");
					System.out.println("1 - Listar pacientes;");
					System.out.println("2 - Atender pacientes;");
					System.out.println("3 - Trocar de usuário;");
					System.out.println("4 - Fechar o programa;");
                    
					System.out.println("\n--------------------------");
					System.out.println("Opção escolhida: ");
					escolha1 = scan.nextInt();
					System.out.println("--------------------------");
					
					switch(escolha1) {
						case 1:
                            limpaTela();
							medico.listaAtendimento(paciente);
							break;
						case 2:
                            limpaTela();
							medico.atenderPaciente(paciente);
							break;
						case 3:
							i=0;
							limpaTela();
							break;
						case 4:
							i2=0;
							i=0;
							limpaTela();
							break;
				    }
                }
				
			}
			else if(escolha1 == 3) {
				
				while(i!=0) {
				    limpaTela();
				    
                    System.out.println("Informe o número da opção que deseja abrir:");
                    System.out.println("----------------------------------------------\n");
					
					System.out.println("1 - Listar pacientes;");
					System.out.println("2 - Atender pacientes;");
					System.out.println("3 - Trocar de usuario;");
					System.out.println("4 - Fechar o programa;");
                    
					System.out.println("\n--------------------------");
					System.out.println("Opção escolhida: ");
					escolha1 = scan.nextInt();
					System.out.println("--------------------------");
					
					switch(escolha1) {
						
						case 1:
                            limpaTela();
							enfermeiro.listaAtendimento(paciente);
							break;
						case 2:
                            limpaTela();
							enfermeiro.atenderPaciente(paciente, remed, medico);
							break;
						case 3:
							i=0;
							limpaTela();
							break;
						case 4:
							i2=0;
							i=0;
							limpaTela();
							break;
					}
				}
				
			}
			else if(escolha1 == 4) { 
				
				while(i!=0) {
				    limpaTela();
                    System.out.println("Informe o número da opção que deseja abrir:");
                    System.out.println("----------------------------------------------\n");
					System.out.println("1 - Cadastrar paciente;");
					System.out.println("2 - Cadastrar médico;");
					System.out.println("3 - Cadastrar enfermeiro;");
					System.out.println("4 - Cadastrar medicamento");
					System.out.println("5 - Excluir paciente;");
					System.out.println("6 - Excluir médico;");
					System.out.println("7 - Excluir enfermeiro;");
					System.out.println("8 - Listar pacientes(Médico);");
					System.out.println("9 - Listar pacientes(Enfermeiro);");
					System.out.println("10 - Atender pacientes(Médico);");
					System.out.println("11 - Atender pacientes(Enfermeiro);");
					System.out.println("12 - Trocar de usuário");
					System.out.println("13 - Fechar o programa;");
                    
					System.out.println("\n--------------------------");
					System.out.println("Opção escolhida: ");
					escolha1 = scan.nextInt();
					System.out.println("--------------------------");
					
					switch(escolha1) {
						case 1:
                            limpaTela();
                            paciente.cadastro(); 
                            break;
						case 2:
                            limpaTela();
                            medico.cadastro(); 
                            break;
		                case 3:
                            limpaTela();
							enfermeiro.cadastro();
							break;
		                case 4:
                            limpaTela();
                            remed.cadastrarMedicamento();
                            break;
						case 5: 
                            limpaTela();
							paciente.excluirCadastro();
							break;
						case 6:
                            limpaTela();
							medico.excluirCadastro();
							break;
						case 7:
                            limpaTela();
							enfermeiro.excluirCadastro();
							break;
						case 8:
                            limpaTela();
							medico.listaAtendimento(paciente);
							break;
						case 9:
                            limpaTela();
							enfermeiro.listaAtendimento(paciente);
							break;
						case 10:
                            limpaTela();
							medico.atenderPaciente(paciente);
							break;
						case 11:
                            limpaTela();
							enfermeiro.atenderPaciente(paciente, remed, medico);
							break;
						case 12:
							i=0;
							limpaTela();
							break;
						case 13:
							i2=0;
							i=0;
							limpaTela();
							break;
			        }
                }
				
			}
		}
	}
}