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
import es.salesianos.model.City;
import es.salesianos.model.Country;
import es.salesianos.model.Passenger;
import es.salesianos.model.Worker;


@Repository("repositoryPassenger")
public class RepositoryPassenger {
	
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

	public void insertPassenger(Passenger passenger) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO Passengers (NationalityID, Name, Surname, Passport, Email, AccumulatedPoints, IdCountry, IdRole, Password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prepareStatement.setInt(1, passenger.getIdNationality());
			prepareStatement.setString(2, passenger.getName());
			prepareStatement.setString(3, passenger.getSurname());
			prepareStatement.setString(4, passenger.getPassport());
			prepareStatement.setString(5, passenger.getEmail());
			prepareStatement.setInt(6, 0);
			prepareStatement.setInt(7, passenger.getIdCountry());
			prepareStatement.setInt(8, 6);
			prepareStatement.setString(9, passenger.getPassword());
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
