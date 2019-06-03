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
import es.salesianos.model.Airport;
import es.salesianos.model.City;
import es.salesianos.model.Country;


@Repository("repositoryAirport")
public class RepositoryAirport {
	
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

	
	
	public List<Airport> sellectAllAirportsByCountry(int idCountry) {
		List<Airport> listAirports = new ArrayList<Airport>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT A.AirportName from TFG.Airports AS A, TFG.Cities AS C, TFG.Countries AS D WHERE A.Id_City = C.idCity AND C.id_Country = D.idCountries;");
			prepareStatement.setInt(1, idCountry);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportInDatabase = new Airport();
				airportInDatabase.set(resultSet.getInt(1));
				airportInDatabase.setCityName(resultSet.getString(2));
				listAirports.add(airportInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listAirports;
	}
}
