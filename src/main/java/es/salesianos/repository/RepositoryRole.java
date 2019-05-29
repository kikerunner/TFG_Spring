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
import es.salesianos.model.Role;
import es.salesianos.model.Worker;


@Repository("repositoryRole")
public class RepositoryRole {
	
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

	public List<Role> sellectAllNationalities() {
		List<Role> listRoles = new ArrayList<Role>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT * FROM Roles");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Role roleInDatabase = new Role();
				roleInDatabase.setIdRole(resultSet.getInt(1));
				roleInDatabase.setRoleName(resultSet.getString(2));
				listRoles.add(roleInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listRoles;
	}
}
