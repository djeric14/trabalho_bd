package br.fa7.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.fa7.connection.ConnectionOracle;

public class EspecialidadeDao {

	private Connection connection;
	private PreparedStatement stmt;

	public EspecialidadeDao() {
		try {
			connection = ConnectionOracle.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void adicionar(Long id, String nome) throws SQLException {
		String sql = "insert into especialidade(id_especialidade, nome) values (?, ?)";
		stmt = connection.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.setString(2, nome);
		stmt.execute();
		stmt.close();
	}

	public void alterar(Long id, String nome) throws SQLException {
		String sql = "update especialidade set especialidade.nome = ? where especialidade.id_especialidade = ?";
		stmt = connection.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setLong(2, id);
		stmt.execute();
		stmt.close();

	}

	public void excluir(Long id) throws SQLException {
		String sql = "delete from especialidade where id_especialidade = ?";
		stmt = connection.prepareStatement(sql);
		stmt.setLong(1, id);
		stmt.executeUpdate();
		stmt.close();

	}

	public void fechar() throws SQLException {
		stmt.close();
		connection.close();
	}

	/**
	 * public List<Proprietario> getLista(){ List<Proprietario> proprietarios =
	 * new ArrayList<Proprietario>(); PreparedStatement stmt; try{ stmt =
	 * this.connection.prepareStatement("select * from proprietario"); ResultSet
	 * rs = stmt.executeQuery();
	 * 
	 * while(rs.next()){ Proprietario proprietario = new Proprietario();
	 * proprietario.setCodigo(rs.getLong("COD_PROPRIETARIO"));
	 * proprietario.setNome(rs.getString("NOME_PROPRIETARIO"));
	 * proprietario.setEndereco(rs.getString("ENDERECO_PROPRIETARIO"));
	 * proprietario.setCelular(rs.getString("CEL_CONTATO_PROPRIETARIO"));
	 * proprietarios.add(proprietario); } rs.close(); stmt.close();
	 * 
	 * }catch (SQLException e) { // TODO Auto-generated catch block throw new
	 * RuntimeException(); } return proprietarios; }
	 */

}
