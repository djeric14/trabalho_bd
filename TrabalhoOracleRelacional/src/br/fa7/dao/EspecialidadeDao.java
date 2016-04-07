package br.fa7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.fa7.model.Especialidade;

public class EspecialidadeDao extends BaseDao {

	private PreparedStatement stmt;
	private Connection connection;

	public EspecialidadeDao() {
		connection = getConnection();
	}

	public void adicionar(Especialidade especialidade) {

		String sql = "insert into especialidade(id_especialidade, nome) values (?, ?)";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setLong(1, especialidade.getId());
			stmt.setString(2, especialidade.getNome());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fechar();
			e.printStackTrace();
		}

	}

	public void alterar(Especialidade especialidade) {
		String sql = "update especialidade set especialidade.nome = ? where especialidade.id_especialidade = ?";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, especialidade.getNome());
			stmt.setLong(2, especialidade.getId());
			stmt.execute();
			stmt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fechar();
			e.printStackTrace();
		}

	}

	public void excluir() {
		String sql = "delete from especialidade";
		try {
			stmt = connection.prepareStatement(sql);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			fechar();
			e.printStackTrace();
		}
	}

	public void fechar() {
		try {
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
