package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Role {
	private int idrole;
	private String roleName;
	public int getIdrole() {
		return idrole;
	}
	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
