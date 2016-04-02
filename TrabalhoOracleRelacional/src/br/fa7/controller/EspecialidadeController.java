package br.fa7.controller;

import java.sql.SQLException;

import br.fa7.dao.EspecialidadeDao;

public class EspecialidadeController {
	
	private static final String[] especialidades = { "Cardiologia", "Gastroentorogia", "Urologia", 
			"Otorrinolaringologia", "Neulorogia", "Protoclogia", "Hematologia",
			"Endocrinologia", "Traumatologia", "Ortopedia", "Dermatologia"};
		
	private static EspecialidadeDao dao = new EspecialidadeDao();
	private static Long tempo;
	
	public static Long adicionarEspecialidade() throws SQLException{
		tempo = System.currentTimeMillis();
		System.out.println("Iniciada a inclusão ...");
		
		for(Long i = 1L; i <= 100000; i++){
			dao.adicionar(i,  getEspecialidadeAleatoria());
		}
			
		tempo = (System.currentTimeMillis() - tempo) / 1000; 
		System.out.println("Especialidades adicionadas com sucesso - Tempo: "+ tempo+" segundos");
		return tempo;
	}
	
	public static Long alterarEspecialidade() throws SQLException{
		tempo = System.currentTimeMillis();
		System.out.println("Iniciada a alteração ...");
		
		for(Long i = 1L; i <= 100000; i++){
			dao.alterar(i,  getEspecialidadeAleatoria());
		}
			
		tempo = (System.currentTimeMillis() - tempo) / 1000; 
		System.out.println("Especialidades alteradas com sucesso - Tempo: "+ tempo+" segundos");
		return tempo;
	}
	
	public static Long excluirEspecialidade() throws SQLException{
		tempo = System.currentTimeMillis();
		System.out.println("Iniciada a exclusão ...");
		
		for(Long i = 1L; i <= 100000; i++){
			dao.excluir(i);
		}
			
		tempo = (System.currentTimeMillis() - tempo) / 1000; 
		System.out.println("Especialidades excluídas com sucesso - Tempo: "+ tempo+" segundos");
		return tempo;
	}
	
	public static void fechar() throws SQLException{
		dao.fechar();
	}
	

	private static String getEspecialidadeAleatoria() {
		int posicao = (int) Math.round(Math.random() * (especialidades.length - 1));
		return especialidades[posicao];
	}
	
	
}
