package rentier.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Renovation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String companyName;
	private String contact;
	private BigDecimal floor;
	private BigDecimal walls;
	private BigDecimal painting;
	private BigDecimal bathroom;
	private BigDecimal kitchen;
	private BigDecimal frontDoor;
	private BigDecimal indorDoor;
	private BigDecimal window;
	private BigDecimal changeHeatingSystem;
	private BigDecimal electricity;
	private BigDecimal balcony;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public BigDecimal getFloor() {
		return floor;
	}

	public void setFloor(BigDecimal floor) {
		this.floor = floor;
	}

	public BigDecimal getWalls() {
		return walls;
	}

	public void setWalls(BigDecimal walls) {
		this.walls = walls;
	}

	public BigDecimal getPainting() {
		return painting;
	}

	public void setPainting(BigDecimal painting) {
		this.painting = painting;
	}

	public BigDecimal getBathroom() {
		return bathroom;
	}

	public void setBathroom(BigDecimal bathroom) {
		this.bathroom = bathroom;
	}

	public BigDecimal getKitchen() {
		return kitchen;
	}

	public void setKitchen(BigDecimal kitchen) {
		this.kitchen = kitchen;
	}

	public BigDecimal getFrontDoor() {
		return frontDoor;
	}

	public void setFrontDoor(BigDecimal frontDoor) {
		this.frontDoor = frontDoor;
	}

	public BigDecimal getIndorDoor() {
		return indorDoor;
	}

	public void setIndorDoor(BigDecimal indorDoor) {
		this.indorDoor = indorDoor;
	}


	public BigDecimal getChangeHeatingSystem() {
		return changeHeatingSystem;
	}

	public void setChangeHeatingSystem(BigDecimal changeHeatingSystem) {
		this.changeHeatingSystem = changeHeatingSystem;
	}

	public BigDecimal getElectricity() {
		return electricity;
	}

	public void setElectricity(BigDecimal electricity) {
		this.electricity = electricity;
	}

	public BigDecimal getBalcony() {
		return balcony;
	}

	public void setBalcony(BigDecimal balcony) {
		this.balcony = balcony;
	}

	public BigDecimal getWindow() {
		return window;
	}

	public void setWindow(BigDecimal window) {
		this.window = window;
	}

}
