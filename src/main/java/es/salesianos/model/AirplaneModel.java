package es.salesianos.model;

public class AirplaneModel {
	private int IDAirplaneModel;
	private String AirplaneModel;
	private AirplaneBrandName airplaneBrandName;
	
	public int getIDAirplaneModel() {
		return IDAirplaneModel;
	}
	public void setIDAirplaneModel(int iDAirplaneModel) {
		IDAirplaneModel = iDAirplaneModel;
	}
	public String getAirplaneModel() {
		return AirplaneModel;
	}
	public void setAirplaneModel(String airplaneModel) {
		AirplaneModel = airplaneModel;
	}
	public AirplaneBrandName getAirplaneBrandName() {
		return airplaneBrandName;
	}
	public void setAirplaneBrandName(AirplaneBrandName airplaneBrandName) {
		this.airplaneBrandName = airplaneBrandName;
	}
}
