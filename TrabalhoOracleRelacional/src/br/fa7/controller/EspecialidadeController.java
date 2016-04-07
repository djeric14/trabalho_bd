package br.fa7.controller;

import br.fa7.dao.EspecialidadeDao;
import br.fa7.model.Especialidade;

public class EspecialidadeController extends Controller {
	
	private static final String[] especialidades = { "Cardiologia", "Gastroentorogia", "Urologia", 
			"Otorrinolaringologia", "Neulorogia", "Protoclogia", "Hematologia",
			"Endocrinologia", "Traumatologia", "Ortopedia", "Dermatologia"};
		
	private EspecialidadeDao dao = new EspecialidadeDao();
	private Especialidade especialidade = new Especialidade();
	
	public void adicionar() {
		
		initTimer();
		System.out.println("Iniciada a inclusão de "+getRegistros() +" especialidades ...");
		
		for(Long i = 1L; i <= getRegistros(); i++){
			especialidade.setId(i);
			especialidade.setNome(getEspecialidadeAleatoria());
			dao.adicionar(especialidade);
		}
			
		System.out.println("Especialidades adicionadas com sucesso - Tempo: "+ finishTimer()+" segundos");
	}
	
	public void alterar() {
		initTimer();
		System.out.println("Iniciada a alteração das especialidades ...");
		
		for(Long i = 1L; i <= getRegistros(); i++){
			especialidade.setId(i);
			especialidade.setNome(getEspecialidadeAleatoria());
			dao.alterar(especialidade);
		}
		 
		System.out.println("Especialidades alteradas com sucesso - Tempo: "+ finishTimer()+" segundos");
	}
	
	public void excluir() {
		initTimer();
		System.out.println("Iniciada a exclusão das especialidades ...");
		
		dao.excluir();
			
		System.out.println("Especialidades excluídas com sucesso - Tempo: "+ finishTimer()+" segundos");
	}
	

	private String getEspecialidadeAleatoria() {
		int posicao = (int) Math.round(Math.random() * (especialidades.length - 1));
		return especialidades[posicao];
	}
}
