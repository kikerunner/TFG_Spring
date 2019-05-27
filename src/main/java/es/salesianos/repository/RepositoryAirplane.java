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


@Repository("repositoryairplane")
public class RepositoryAirplane {
	
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

	public void insertAirplane(Airplane airplane) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO Airplanes (AIRPLANENAME, idAirplaneModel, FlightHours, SeatsNumber, FuelQuantity, WorkersNumber) VALUES (?, ?, ?, ?, ?, ?)");
			prepareStatement.setString(1, airplane.getAirplaneName());
			prepareStatement.setInt(2, airplane.getIdAirplaneModel());
			prepareStatement.setFloat(3, airplane.getFlightHours());
			prepareStatement.setInt(4, airplane.getSeatsNumber());
			prepareStatement.setInt(5, airplane.getFuelQuantity());
			prepareStatement.setInt(6, airplane.getWorkersNumber());
			System.out.println(airplane.getFlightHours());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
	}
	
	public List<Airplane> sellectAllAirplanes() {
		List<Airplane> listAirplanes = new ArrayList<Airplane>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM Airplanes");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Airplane airplaneInDatabase = new Airplane();
				airplaneInDatabase.setIdAirplane(resultSet.getInt(1));
				airplaneInDatabase.setAirplaneName(resultSet.getString(2));
				airplaneInDatabase.setIdAirplaneModel(resultSet.getInt(3));
				airplaneInDatabase.setFlightHours(resultSet.getFloat(4));
				airplaneInDatabase.setSeatsNumber(resultSet.getInt(5));
				airplaneInDatabase.setFuelQuantity(resultSet.getInt(6));
				airplaneInDatabase.setWorkersNumber(resultSet.getInt(7));
				listAirplanes.add(airplaneInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanes;
	}
	
	public List<Airplane> sellectAllAirplanesAndModel() {
		List<Airplane> listAirplanes = new ArrayList<Airplane>();
		AirplaneModel airplaneModel = new AirplaneModel();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT A.idAirplane, A.AirplaneName, M.AirplaneModel, A.FlightHours, A.SeatsNumber, A.FuelQuantity, A.WorkersNumber from TFG.Airplanes AS A, TFG.AirplanesModels AS M WHERE (A.idAirplaneModel = M.idAirplanesModel);");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Airplane airplaneInDatabase = new Airplane();
				AirplaneModel airplaneModelInDatabase = new AirplaneModel();
				airplaneInDatabase.setIdAirplane(resultSet.getInt(1));
				airplaneInDatabase.setAirplaneName(resultSet.getString(2));
				airplaneModelInDatabase.setAirplaneModel(resultSet.getString(3));
				airplaneInDatabase.setFlightHours(resultSet.getFloat(4));
				airplaneInDatabase.setSeatsNumber(resultSet.getInt(5));
				airplaneInDatabase.setFuelQuantity(resultSet.getInt(6));
				airplaneInDatabase.setWorkersNumber(resultSet.getInt(7));
				airplaneInDatabase.setModel(airplaneModelInDatabase);
				listAirplanes.add(airplaneInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanes;
	}
}
