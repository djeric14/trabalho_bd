package br.fa7.test;

import br.fa7.controller.ConsultaMedicaController;
import br.fa7.controller.EspecialidadeController;
import br.fa7.controller.MedicoController;
import br.fa7.controller.PacienteController;
import br.fa7.controller.QueryController;

public class Teste {
	
	private static EspecialidadeController especialidadeController = new EspecialidadeController();
	private static MedicoController medicoController = new MedicoController();
	private static PacienteController pacienteController = new PacienteController();
	private static ConsultaMedicaController consultaController = new ConsultaMedicaController();
	private static Double tempo;
	private static Double tempoTotal;
	
	public static void adicionarDados(){
		System.out.println("Iniciada a adição de dados");
		tempo = (double) System.currentTimeMillis();
		especialidadeController.adicionar();
		medicoController.adicionar();
		//pacienteController.adicionar();
		//consultaController.adicionar();
		
		tempo = (System.currentTimeMillis()-tempo)/1000; 
		
		System.out.println("Tempo final para adicão dos dados "+ tempo);
	}
	
	public static void consultarDados(){
		new QueryController().executeQuery();
	}
	
	public static void alterarDados(){
		System.out.println("Iniciada a alteração de dados");
		tempo = (double) System.currentTimeMillis();
		especialidadeController.alterar();
		medicoController.alterar();
		pacienteController.alterar();
		consultaController.alterar();
		
		tempo = (System.currentTimeMillis()-tempo)/1000; 
		
		System.out.println("Tempo final para alteração dos dados "+ tempo);
	}
	
	public static void excluirDados(){
		System.out.println("Iniciada a exclusão de dados");
		tempo = (double) System.currentTimeMillis();
		consultaController.excluir();
		medicoController.excluir();
		pacienteController.excluir();
		especialidadeController.excluir();
	
		tempo = (System.currentTimeMillis()-tempo)/1000; 
		
		System.out.println("Tempo final para exclusão dos dados "+ tempo);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tempoTotal = (double) System.currentTimeMillis();
		adicionarDados();
		consultarDados();
		alterarDados();
		excluirDados();
		tempoTotal = (System.currentTimeMillis()-tempoTotal)/1000;
		System.out.println("Tempo total de execução: "+ tempoTotal);
	}

}
