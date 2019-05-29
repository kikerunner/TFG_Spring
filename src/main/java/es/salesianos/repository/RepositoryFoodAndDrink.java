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
import es.salesianos.model.FoodAndDrink;
import es.salesianos.model.Worker;


@Repository("repositoryFoodAndDrink")
public class RepositoryFoodAndDrink {
	
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

	public void insertFoodAndDrink(FoodAndDrink foodAndDrink) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO FoodAndDrinks (Name, Food, Dinner, Extra1, Extra2, Extra3) VALUES (?, ?, ?, ?, ?, ?)");
			prepareStatement.setString(1, foodAndDrink.getName());
			prepareStatement.setString(2, foodAndDrink.getFood());
			prepareStatement.setString(3, foodAndDrink.getDinner());
			prepareStatement.setString(4, foodAndDrink.getExtra1());
			prepareStatement.setString(5, foodAndDrink.getExtra2());
			prepareStatement.setString(6, foodAndDrink.getExtra3());
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
