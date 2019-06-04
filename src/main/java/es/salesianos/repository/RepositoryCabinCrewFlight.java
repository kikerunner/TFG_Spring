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
	
	public List<CabinCrewFlight> sellectAllACabinCrewFlight4Workers() {
		List<CabinCrewFlight> listCabinCrewFlight = new ArrayList<CabinCrewFlight>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT C.idCabinCrewFlight, K.idWorker, K.Name, K.Surname, K1.idWorker, K1.Name, K1.Surname, K2.idWorker, K2.Name, K2.Surname, K3.idWorker, K3.Name, K3.Surname, K4.idWorker, K4.Name, K4.Surname, K5.idWorker, K5.Name, K5.Surname, K6.idWorker, K6.Name, K6.Surname FROM TFG.CabinCrewFlight AS C, TFG.Workers AS K, TFG.Workers AS K1, TFG.Workers AS K2, TFG.Workers AS K3, TFG.Workers AS K4, TFG.Workers AS K5, TFG.Workers AS K6, TFG.Workers AS K7, TFG.Workers AS K8, TFG.Workers AS K9  WHERE K.idWorker and K.idWorker = C.id_Pilot AND K1.idWorker = C.id_Copilot AND K2.idWorker = C.id_ChiefCrewMember AND K3.idWorker = C.id_FlightAttendant1 AND K4.idWorker = C.id_FlightAttendant2 AND K5.idWorker = C.id_FlightAttendant3 AND K6.idWorker = C.id_FlightAttendant4 group by C.idCabinCrewFlight HAVING COUNT(*) > 1;");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				CabinCrewFlight cabinCrewFlightInDatabase = new CabinCrewFlight();
				cabinCrewFlightInDatabase.setIdcabinCrewFlight(resultSet.getInt(1));
				
				cabinCrewFlightInDatabase.setIdPilot(resultSet.getInt(2));
				cabinCrewFlightInDatabase.setPilotName(resultSet.getString(3));;
				cabinCrewFlightInDatabase.setPilotSurname(resultSet.getString(4));
				
				cabinCrewFlightInDatabase.setIdCoPilot(resultSet.getInt(5));
				cabinCrewFlightInDatabase.setCoPilotName(resultSet.getString(6));;
				cabinCrewFlightInDatabase.setCoPilotSurname(resultSet.getString(7));
				
				cabinCrewFlightInDatabase.setIdChiefCrewMember(resultSet.getInt(8));
				cabinCrewFlightInDatabase.setChiefCrewMemberName(resultSet.getString(9));;
				cabinCrewFlightInDatabase.setChiefCrewSurname(resultSet.getString(10));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant1(resultSet.getInt(11));
				cabinCrewFlightInDatabase.setFlightAttendant1Name(resultSet.getString(12));;
				cabinCrewFlightInDatabase.setFlightAttendant1Surname(resultSet.getString(13));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant2(resultSet.getInt(14));
				cabinCrewFlightInDatabase.setFlightAttendant2Name(resultSet.getString(15));;
				cabinCrewFlightInDatabase.setFlightAttendant2Surname(resultSet.getString(16));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant3(resultSet.getInt(17));
				cabinCrewFlightInDatabase.setFlightAttendant3Name(resultSet.getString(18));;
				cabinCrewFlightInDatabase.setFlightAttendant3Surname(resultSet.getString(19));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant4(resultSet.getInt(20));
				cabinCrewFlightInDatabase.setFlightAttendant4Name(resultSet.getString(21));;
				cabinCrewFlightInDatabase.setFlightAttendant4Surname(resultSet.getString(22));
				
				listCabinCrewFlight.add(cabinCrewFlightInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listCabinCrewFlight;
	}
	public List<CabinCrewFlight> sellectAllACabinCrewFlight6Workers() {
		List<CabinCrewFlight> listCabinCrewFlight = new ArrayList<CabinCrewFlight>();
		Connection conn = manager.open(jdbcUrl);
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;
		try {
			prepareStatement = conn.prepareStatement("SELECT C.idCabinCrewFlight, K.idWorker, K.Name, K.Surname, K1.idWorker, K1.Name, K1.Surname, K2.idWorker, K2.Name, K2.Surname, K3.idWorker, K3.Name, K3.Surname, K4.idWorker, K4.Name, K4.Surname, K5.idWorker, K5.Name, K5.Surname, K6.idWorker, K6.Name, K6.Surname, K7.idWorker, K7.Name, K7.Surname, K8.idWorker, K8.Name, K8.Surname FROM TFG.CabinCrewFlight AS C, TFG.Workers AS K, TFG.Workers AS K1, TFG.Workers AS K2, TFG.Workers AS K3, TFG.Workers AS K4, TFG.Workers AS K5, TFG.Workers AS K6, TFG.Workers AS K7, TFG.Workers AS K8, TFG.Workers AS K9  WHERE K.idWorker and K.idWorker = C.id_Pilot AND K1.idWorker = C.id_Copilot AND K2.idWorker = C.id_ChiefCrewMember AND K3.idWorker = C.id_FlightAttendant1 AND K4.idWorker = C.id_FlightAttendant2 AND K5.idWorker = C.id_FlightAttendant3 AND K6.idWorker = C.id_FlightAttendant4 AND K5.idWorker = C.id_FlightAttendant3 AND K6.idWorker = C.id_FlightAttendant4 AND K7.idWorker = C.id_FlightAttendant5 AND K8.idWorker = C.id_FlightAttendant6 group by C.idCabinCrewFlight HAVING COUNT(*) > 1;");
			resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				CabinCrewFlight cabinCrewFlightInDatabase = new CabinCrewFlight();
				cabinCrewFlightInDatabase.setIdcabinCrewFlight(resultSet.getInt(1));
				
				cabinCrewFlightInDatabase.setIdPilot(resultSet.getInt(2));
				cabinCrewFlightInDatabase.setPilotName(resultSet.getString(3));;
				cabinCrewFlightInDatabase.setPilotSurname(resultSet.getString(4));
				
				cabinCrewFlightInDatabase.setIdCoPilot(resultSet.getInt(5));
				cabinCrewFlightInDatabase.setCoPilotName(resultSet.getString(6));;
				cabinCrewFlightInDatabase.setCoPilotSurname(resultSet.getString(7));
				
				cabinCrewFlightInDatabase.setIdChiefCrewMember(resultSet.getInt(8));
				cabinCrewFlightInDatabase.setChiefCrewMemberName(resultSet.getString(9));;
				cabinCrewFlightInDatabase.setChiefCrewSurname(resultSet.getString(10));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant1(resultSet.getInt(11));
				cabinCrewFlightInDatabase.setFlightAttendant1Name(resultSet.getString(12));;
				cabinCrewFlightInDatabase.setFlightAttendant1Surname(resultSet.getString(13));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant2(resultSet.getInt(14));
				cabinCrewFlightInDatabase.setFlightAttendant2Name(resultSet.getString(15));;
				cabinCrewFlightInDatabase.setFlightAttendant2Surname(resultSet.getString(16));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant3(resultSet.getInt(17));
				cabinCrewFlightInDatabase.setFlightAttendant3Name(resultSet.getString(18));;
				cabinCrewFlightInDatabase.setFlightAttendant3Surname(resultSet.getString(19));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant4(resultSet.getInt(20));
				cabinCrewFlightInDatabase.setFlightAttendant4Name(resultSet.getString(21));;
				cabinCrewFlightInDatabase.setFlightAttendant4Surname(resultSet.getString(22));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant5(resultSet.getInt(23));
				cabinCrewFlightInDatabase.setFlightAttendant5Name(resultSet.getString(24));;
				cabinCrewFlightInDatabase.setFlightAttendant5Surname(resultSet.getString(25));
				
				cabinCrewFlightInDatabase.setIdFlightAttendant6(resultSet.getInt(26));
				cabinCrewFlightInDatabase.setFlightAttendant6Name(resultSet.getString(27));;
				cabinCrewFlightInDatabase.setFlightAttendant6Surname(resultSet.getString(28));
				
				System.out.println("id Flight attendant" + resultSet.getInt(26));
				listCabinCrewFlight.add(cabinCrewFlightInDatabase);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}finally {
			close(prepareStatement);
		}
		manager.close(conn);
		return listCabinCrewFlight;
	}
}
