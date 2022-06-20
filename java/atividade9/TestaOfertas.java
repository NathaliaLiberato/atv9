package atividade9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class TestaOfertas {
	

	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory factory = new ConnectionFactory();
		
		try(Connection connection = factory.recuperarConexao()){
	
		 try (Scanner scanner = new Scanner(System.in)) {
			String oferta;
			 System.out.println("Cadastre sua primeira oferta: ");
			 oferta = scanner.nextLine();

				Statement stm = connection.createStatement();
				stm.execute("INSERT INTO TBPRODUTOS (NOME) VALUES ('"+ oferta +"')", Statement.RETURN_GENERATED_KEYS);

				System.out.println("Oferta cadastrada: " + oferta);
				try (ResultSet rst = stm.getGeneratedKeys()) {
				}
	
		}
		}	
	}
}