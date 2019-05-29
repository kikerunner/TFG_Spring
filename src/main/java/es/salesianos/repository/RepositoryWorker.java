package es.salesianos.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import es.salesianos.connection.ConnectionSQL;
import es.salesianos.connection.ConnectionManager;
import es.salesianos.model.Airplane;
import es.salesianos.model.AirplaneModel;
import es.salesianos.model.Country;
import es.salesianos.model.Worker;


@Repository("repositoryWorker")
public class RepositoryWorker {
	
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/TFG";
	ConnectionManager manager = new ConnectionSQL();

	private void close(PreparedStatement prepareStatement) {
		try {
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private void close(ResultSet resultSet) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public void insertWorker(Worker worker) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO Workers (Passport, Name, Surname, Photo, Address, Id_City, Id_Nationality, Password, Id_Role) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prepareStatement.setString(1, worker.getPassport());
			prepareStatement.setString(2, worker.getName());
			prepareStatement.setString(3, worker.getSurname());
			prepareStatement.setString(4, worker.getPhoto());
			prepareStatement.setString(5, worker.getAddress());
			prepareStatement.setInt(6, worker.getIdCity());
			prepareStatement.setInt(7, worker.getIdNationality());
			prepareStatement.setString(8, worker.getPassword());
			prepareStatement.setInt(9, worker.getIdRole());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
	}
}
