package atividade9;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;

	public class Lista{

		public static void main(String[] args) throws SQLException {

			ConnectionFactory connectionFactory = new ConnectionFactory();
			Connection connection = connectionFactory.recuperarConexao();

			PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO, PRECO FROM TBPRODUTOS");
			stm.execute();
			ResultSet rst = stm.getResultSet();
			
			while(rst.next()) {
				Integer id = rst.getInt("ID");
				String nome = rst.getString("NOME");
				String descricao = rst.getString("DESCRICAO");
				Float preco = rst.getFloat("PRECO");
				System.out.println(id);
				System.out.println(nome);
				System.out.println(descricao);
				System.out.println(preco);
			}
			rst.close();
			stm.close();
			connection.close();
		}
	}

