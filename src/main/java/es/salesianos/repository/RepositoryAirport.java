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
	
	public List<Airport> selectAllAirportsAndCities() {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		List<Airport> airportsList = new ArrayList<Airport>();
		
		try {
			preparedStatement = conn
					.prepareStatement("SELECT A.idAirport, A.AirportName, A.IATA, A.ICAO, C.idCity, C.CityName FROM TFG.Airports AS A, TFG.Cities AS C WHERE (A.Id_City = C.idCity);");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportFromDataBase = new Airport();
				airportFromDataBase.setIdairport(resultSet.getInt(1));
				airportFromDataBase.setAirportName(resultSet.getString(2));
				airportFromDataBase.setIata(resultSet.getString(3));
				airportFromDataBase.setIcao(resultSet.getString(4));
				City cityInDatabase = new City();
				cityInDatabase.setIdCity(resultSet.getInt(5));
				cityInDatabase.setCityName(resultSet.getString(6));
				airportFromDataBase.setCity(cityInDatabase);
				airportsList.add(airportFromDataBase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			close(preparedStatement);
			manager.close(conn);
		}
		return airportsList;
	}
	
	public List<Airport> selectAllAirportsAndCitiesByIcao(String iCAO) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		List<Airport> airportsList = new ArrayList<Airport>();
		try {
			preparedStatement = conn
					.prepareStatement("SELECT A.idAirport, A.AirportName, A.IATA, A.ICAO, C.idCity, C.CityName FROM TFG.Airports AS A, TFG.Cities AS C WHERE (A.Id_City = C.idCity) AND A.ICAO = (?);");
			preparedStatement.setString(1, iCAO);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportFromDataBase = new Airport();
				airportFromDataBase.setIdairport(resultSet.getInt(1));
				airportFromDataBase.setAirportName(resultSet.getString(2));
				airportFromDataBase.setIata(resultSet.getString(3));
				airportFromDataBase.setIcao(resultSet.getString(4));
				City cityInDatabase = new City();
				cityInDatabase.setIdCity(resultSet.getInt(5));
				cityInDatabase.setCityName(resultSet.getString(6));
				airportFromDataBase.setCity(cityInDatabase);
				airportsList.add(airportFromDataBase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			close(preparedStatement);
			manager.close(conn);
		}
		return airportsList;
	}
	
	public List<Airport> selectAllAirportsAndCitiesByIata(String iATA) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		List<Airport> airportsList = new ArrayList<Airport>();
		try {
			preparedStatement = conn
					.prepareStatement("SELECT A.idAirport, A.AirportName, A.IATA, A.ICAO, C.idCity, C.CityName FROM TFG.Airports AS A, TFG.Cities AS C WHERE (A.Id_City = C.idCity) AND A.IATA = (?);");
			preparedStatement.setString(1, iATA);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportFromDataBase = new Airport();
				airportFromDataBase.setIdairport(resultSet.getInt(1));
				airportFromDataBase.setAirportName(resultSet.getString(2));
				airportFromDataBase.setIata(resultSet.getString(3));
				airportFromDataBase.setIcao(resultSet.getString(4));
				City cityInDatabase = new City();
				cityInDatabase.setIdCity(resultSet.getInt(5));
				cityInDatabase.setCityName(resultSet.getString(6));
				airportFromDataBase.setCity(cityInDatabase);
				airportsList.add(airportFromDataBase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			close(preparedStatement);
			manager.close(conn);
		}
		return airportsList;
	}
	
	public List<Airport> selectAllAirportsAndCitiesByName(String airportName) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement preparedStatement = null;
		List<Airport> airportsList = new ArrayList<Airport>();
		try {
			preparedStatement = conn
					.prepareStatement("SELECT A.idAirport, A.AirportName, A.IATA, A.ICAO, C.idCity, C.CityName FROM TFG.Airports AS A, TFG.Cities AS C WHERE (A.Id_City = C.idCity) AND A.AirportName = (?);");
			preparedStatement.setString(1, airportName);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportFromDataBase = new Airport();
				airportFromDataBase.setIdairport(resultSet.getInt(1));
				airportFromDataBase.setAirportName(resultSet.getString(2));
				airportFromDataBase.setIata(resultSet.getString(3));
				airportFromDataBase.setIcao(resultSet.getString(4));
				City cityInDatabase = new City();
				cityInDatabase.setIdCity(resultSet.getInt(5));
				cityInDatabase.setCityName(resultSet.getString(6));
				airportFromDataBase.setCity(cityInDatabase);
				airportsList.add(airportFromDataBase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			close(preparedStatement);
			manager.close(conn);
		}
		return airportsList;
	}
	
	public List<Airport> sellectAllAirportsByCountry(int idCountry) {
		List<Airport> listAirports = new ArrayList<Airport>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT A.idAirport ,A.AirportName from TFG.Airports AS A, TFG.Cities AS C, TFG.Countries AS D WHERE A.Id_City = C.idCity AND C.id_Country = D.idCountries AND D.idCountries = (?);");
			prepareStatement.setInt(1, idCountry);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Airport airportInDatabase = new Airport();
				airportInDatabase.setIdairport(resultSet.getInt(1));
				airportInDatabase.setAirportName(resultSet.getString(2));
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
