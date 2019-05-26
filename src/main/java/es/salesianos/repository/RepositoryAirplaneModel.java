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
import es.salesianos.model.AirplaneModel;


@Repository("repositoryairplaneModel")
public class RepositoryAirplaneModel {
	
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
/*
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
	}*/
	
	public List<AirplaneModel> sellectAllAirplanesModel() {
		List<AirplaneModel> listAirplanesModels = new ArrayList<AirplaneModel>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM AirplanesModels");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				AirplaneModel airplaneModelInDatabase = new AirplaneModel();
				airplaneModelInDatabase.setIdAirplaneModel(resultSet.getInt(1));
				airplaneModelInDatabase.setAirplaneModel(resultSet.getString(2));
				listAirplanesModels.add(airplaneModelInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanesModels;
	}
	
	public List<AirplaneModel> sellectAirplanesModelByCompany(int cod) {
		List<AirplaneModel> listAirplanesModel = new ArrayList<AirplaneModel>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM AirplanesModels WHERE AirplanesBrand_id = (?)");
			prepareStatement.setInt(1, cod);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				AirplaneModel airplaneModelInDatabase = new AirplaneModel();
				airplaneModelInDatabase.setIdAirplaneModel(resultSet.getInt(1));
				airplaneModelInDatabase.setAirplaneModel(resultSet.getString(2));
				listAirplanesModel.add(airplaneModelInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirplanesModel;
	}
}
