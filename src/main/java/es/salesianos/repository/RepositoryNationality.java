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
import es.salesianos.model.Nationality;
import es.salesianos.model.Worker;


@Repository("repositoryNationality")
public class RepositoryNationality {
	
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

	public List<Nationality> sellectAllNationalities() {
		List<Nationality> listNationalities = new ArrayList<Nationality>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM Nationalities");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Nationality nationalityInDatabase = new Nationality();
				nationalityInDatabase.setIdNationality(resultSet.getInt(1));
				nationalityInDatabase.setNationality(resultSet.getString(2));
				listNationalities.add(nationalityInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listNationalities;
	}
}
