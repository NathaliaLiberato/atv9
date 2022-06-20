package atividade9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AtualizaOfertas {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		
		try(Connection connection = factory.recuperarConexao()){
	
		 try (Scanner scanner = new Scanner(System.in)) {
			int mudar;
			 System.out.println("Qual a oferta a ser atualizada: ");
			 mudar = scanner.nextInt();
			 scanner.nextLine();
			 
			 String oferta;
			 System.out.println("Qual a nova oferta: ");
			 oferta = scanner.nextLine();
			 
				Statement stm = connection.createStatement();
				stm.execute("UPDATE TBPRODUTOS SET NOME = '"+ oferta +"'  WHERE ID = "+ mudar +"", Statement.RETURN_GENERATED_KEYS);

				System.out.println("Oferta alterada: " + oferta);
				try (ResultSet rst = stm.getGeneratedKeys()) {
				}

		}
		}	
	}
}

