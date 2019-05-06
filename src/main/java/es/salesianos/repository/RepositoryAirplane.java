package es.salesianos.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.salesianos.connection.ConnectionSQL;
import es.salesianos.connection.ConnectionManager;
import es.salesianos.model.Actor;
import es.salesianos.model.Airplane;
import es.salesianos.model.Director;
import es.salesianos.model.Film;
import es.salesianos.model.FilmActors;


@Repository("repositoryairplane")
public class RepositoryAirplane {
	
	private static final String jdbcUrl = "jdbc:mysql://localhost:3306/TFG";
	ConnectionManager manager = new ConnectionSQL();
	@Autowired Airplane airplaneinDatabase;

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
			prepareStatement = conn.prepareStatement("INSERT INTO Airplanes (AIRPLANENAME) VALUES (?)");
			prepareStatement.setString(1, airplane.getAirplaneName());
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
				listAirplanes.add(airplaneinDatabase);
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
