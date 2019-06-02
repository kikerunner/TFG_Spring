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
import es.salesianos.model.CabinCrewFlight;
import es.salesianos.model.City;
import es.salesianos.model.Country;
import es.salesianos.model.Worker;


@Repository("repositoryCabinCrewFlight")
public class RepositoryCabinCrewFlight {
	
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

	public void insertCabinCrewFlight4A(CabinCrewFlight cabinCrewFlight) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO CabinCrewFlight (Id_Pilot, Id_CoPilot, NumberOfFlightAttendants, Id_ChiefCrewMember, Id_FlightAttendant1, Id_FlightAttendant2, Id_FlightAttendant3, Id_FlightAttendant4) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			prepareStatement.setInt(1, cabinCrewFlight.getIdPilot());
			prepareStatement.setInt(2, cabinCrewFlight.getIdCoPilot());
			prepareStatement.setInt(3, cabinCrewFlight.getNumberOfFlightAttendants());
			prepareStatement.setInt(4, cabinCrewFlight.getIdChiefCrewMember());
			prepareStatement.setInt(5, cabinCrewFlight.getIdFlightAttendant1());
			prepareStatement.setInt(6, cabinCrewFlight.getIdFlightAttendant2());
			prepareStatement.setInt(7, cabinCrewFlight.getIdFlightAttendant3());
			prepareStatement.setInt(8, cabinCrewFlight.getIdFlightAttendant4());
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
	}
	public void insertCabinCrewFlight6A(CabinCrewFlight cabinCrewFlight) {
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		try {
			prepareStatement = conn.prepareStatement("INSERT INTO CabinCrewFlight (Id_Pilot, Id_CoPilot, NumberOfFlightAttendants, Id_ChiefCrewMember, Id_FlightAttendant1, Id_FlightAttendant2, Id_FlightAttendant3, Id_FlightAttendant4, Id_FlightAttendant5, Id_FlightAttendant6) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			prepareStatement.setInt(1, cabinCrewFlight.getIdPilot());
			prepareStatement.setInt(2, cabinCrewFlight.getIdCoPilot());
			prepareStatement.setInt(3, cabinCrewFlight.getNumberOfFlightAttendants());
			prepareStatement.setInt(4, cabinCrewFlight.getIdChiefCrewMember());
			prepareStatement.setInt(5, cabinCrewFlight.getIdFlightAttendant1());
			prepareStatement.setInt(6, cabinCrewFlight.getIdFlightAttendant2());
			prepareStatement.setInt(7, cabinCrewFlight.getIdFlightAttendant3());
			prepareStatement.setInt(8, cabinCrewFlight.getIdFlightAttendant4());
			prepareStatement.setInt(9, cabinCrewFlight.getIdFlightAttendant5());
			prepareStatement.setInt(10, cabinCrewFlight.getIdFlightAttendant6());
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
