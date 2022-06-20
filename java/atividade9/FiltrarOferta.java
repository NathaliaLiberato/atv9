package atividade9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FiltrarOferta {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		
		try(Connection connection = factory.recuperarConexao()){

		 try (Scanner scanner = new Scanner(System.in)) {
			String buscar;
			 System.out.println("Qual a oferta a ser procurada: ");
			 buscar = scanner.nextLine();
			 
			 
				Statement stm = connection.createStatement();
				stm.execute("SELECT * FROM tbprodutos WHERE (NOME) LIKE "+ buscar +"", Statement.RETURN_GENERATED_KEYS);

				System.out.println(buscar);
				try (ResultSet rst = stm.getGeneratedKeys()) {
				}

		}
		}	
	}

	}
