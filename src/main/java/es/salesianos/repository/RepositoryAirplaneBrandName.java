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
import es.salesianos.model.AirplaneBrandName;


@Repository("repositoryairplaneBrandName")
public class RepositoryAirplaneBrandName {
	
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
	
	public List<AirplaneBrandName> sellectAllAirplanesBrandName() {
		List<AirplaneBrandName> listAirplanesBrandName = new ArrayList<AirplaneBrandName>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM AirplanesBrandName");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				AirplaneBrandName airplaneBrandNameInDatabase = new AirplaneBrandName();
				airplaneBrandNameInDatabase.setIdairplaneBrandName(resultSet.getInt(1));
				airplaneBrandNameInDatabase.setAirplaneBrandName(resultSet.getString(2));
				listAirplanesBrandName.add(airplaneBrandNameInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanesBrandName;
	}
	
	public List<AirplaneBrandName> sellectAirplanesModelByCompany() {
		List<AirplaneBrandName> listAirplanesBrandName = new ArrayList<AirplaneBrandName>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM AirplanesBrandName");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				AirplaneBrandName airplaneBrandNameInDatabase = new AirplaneBrandName();
				airplaneBrandNameInDatabase.setIdairplaneBrandName(resultSet.getInt(1));
				airplaneBrandNameInDatabase.setAirplaneBrandName(resultSet.getString(2));
				listAirplanesBrandName.add(airplaneBrandNameInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanesBrandName;
	}
}
