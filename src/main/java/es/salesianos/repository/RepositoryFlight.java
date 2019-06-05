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
import es.salesianos.model.Flight;
import es.salesianos.model.FoodAndDrink;
import es.salesianos.model.Nationality;
import es.salesianos.model.Worker;


@Repository("repositoryFlight")
public class RepositoryFlight {
	
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

	public void insertFlight(Flight flight) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO Flights (FlightName, Id_Airplane, Distance, AvailableSeats, Origin, Destiny, BeginDate, EndDate, id_FoodDrink, id_CabinCrewFlight) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prepareStatement.setString(1, flight.getFlightName());
			prepareStatement.setInt(2, flight.getIdAirplane());
			prepareStatement.setFloat(3, flight.getDistance());
			prepareStatement.setInt(4, flight.getAvailableSeats());
			prepareStatement.setInt(5, flight.getIdAirportOrigin());
			prepareStatement.setInt(6, flight.getIdAirportDestiny());
			prepareStatement.setDate(7, flight.getBeginDate());
			prepareStatement.setDate(8, flight.getEndDate());
			prepareStatement.setInt(9, flight.getIdFoodAndDrink());
			prepareStatement.setInt(10, flight.getIdCabinCrewFlight());
			
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
