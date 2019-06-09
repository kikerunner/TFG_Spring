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
	
	public List<Worker> selectWorkers() {
		List<Worker> listWorkers = new ArrayList<Worker>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT W.idWorker, W.Passport, W.name, W.surname, W.photo, W.address, C.CityName, N.NationalityName, R.RoleName FROM TFG.Workers AS W, TFG.Cities AS C, TFG.Nationalities AS N, TFG.Roles AS R WHERE (W.Id_City = C.idCity) AND (W.Id_Nationality = N.idNationalities) AND (W.Id_Role = R.idRole);");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Worker workerInDatabase = new Worker();
				workerInDatabase.setIdworker(resultSet.getInt(1));
				workerInDatabase.setPassport(resultSet.getString(2));
				workerInDatabase.setName(resultSet.getString(3));
				workerInDatabase.setSurname(resultSet.getString(4));
				workerInDatabase.setPhoto(resultSet.getString(5));
				workerInDatabase.setAddress(resultSet.getString(6));
				workerInDatabase.setCityName(resultSet.getString(7));
				workerInDatabase.setNationalityName(resultSet.getString(8));
				workerInDatabase.setRoleName(resultSet.getString(9));
				listWorkers.add(workerInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listWorkers;
	}
	
	public List<Worker> selectWorkersByIdRole(int idRole) {
		List<Worker> listPilots = new ArrayList<Worker>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT idWorker, name, surname, Id_Role FROM Workers WHERE Id_Role = (?)");
			prepareStatement.setInt(1, idRole);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Worker workerInDatabase = new Worker();
				workerInDatabase.setIdworker(resultSet.getInt(1));
				workerInDatabase.setName(resultSet.getString(2));
				workerInDatabase.setSurname(resultSet.getString(3));
				workerInDatabase.setIdRole(resultSet.getInt(4));
				listPilots.add(workerInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listPilots;
	}
	
	public Worker selectWorkerByID(int idWorker) {
		Worker workerRescuedInDatabase = new Worker();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT idWorker, name, surname, Id_Role, password FROM Workers WHERE IdWorker = (?)");
			prepareStatement.setInt(1, idWorker);
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				workerRescuedInDatabase.setIdworker(resultSet.getInt(1));
				workerRescuedInDatabase.setName(resultSet.getString(2));
				workerRescuedInDatabase.setSurname(resultSet.getString(3));
				workerRescuedInDatabase.setIdRole(resultSet.getInt(4));
				workerRescuedInDatabase.setPassword(resultSet.getString(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return workerRescuedInDatabase;
	}
}
