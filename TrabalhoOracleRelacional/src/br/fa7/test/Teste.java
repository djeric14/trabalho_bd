package br.fa7.test;

import java.sql.SQLException;

import br.fa7.controller.EspecialidadeController;

public class Teste {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			EspecialidadeController.adicionarEspecialidade();
			EspecialidadeController.alterarEspecialidade();
			EspecialidadeController.excluirEspecialidade();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			EspecialidadeController.fechar();
			e.printStackTrace();
		}
		
	}

}
