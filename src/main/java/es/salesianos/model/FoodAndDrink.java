package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class FoodAndDrink {
	private int idfoodAndDrink;
	private String name;
	private String food;
	private String dinner;
	private String extra1;
	private String extra2;
	private String extra3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdfoodAndDrink() {
		return idfoodAndDrink;
	}
	public void setIdfoodAndDrink(int idfoodAndDrink) {
		this.idfoodAndDrink = idfoodAndDrink;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getDinner() {
		return dinner;
	}
	public void setDinner(String dinner) {
		this.dinner = dinner;
	}
	public String getExtra1() {
		return extra1;
	}
	public void setExtra1(String extra1) {
		this.extra1 = extra1;
	}
	public String getExtra2() {
		return extra2;
	}
	public void setExtra2(String extra2) {
		this.extra2 = extra2;
	}
	public String getExtra3() {
		return extra3;
	}
	public void setExtra3(String extra3) {
		this.extra3 = extra3;
	}
}
