package rentier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlatCondition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private boolean floor;
	private boolean walls;
	private int wallsNumber;
	private boolean painting;
	private boolean bathroom;
	private boolean kitchen;
	private boolean frontDoor;
	private boolean indorDoor;
	private int indrDoorNumber;
	private boolean window;
	private int windowNumber;
	private boolean changeHeatingSystem;
	private boolean electricity;
	private boolean balcony; // do remontu

	public FlatCondition() {
		super();
		this.floor = true;
		this.bathroom = true;
		this.kitchen = true;
		this.painting = true;
		this.walls = true;
		this.frontDoor = true;
		this.indorDoor = true;
		this.window = true;
		this.changeHeatingSystem = true;
		this.electricity = true;
		this.balcony = true;
	}

	public boolean isBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public boolean isFloor() {
		return floor;
	}

	public void setFloor(boolean floor) {
		this.floor = floor;
	}

	public boolean isBathroom() {
		return bathroom;
	}

	public void setBathroom(boolean bathroom) {
		this.bathroom = bathroom;
	}

	public boolean isKitchen() {
		return kitchen;
	}

	public void setKitchen(boolean kitchen) {
		this.kitchen = kitchen;
	}

	public boolean isPainting() {
		return painting;
	}

	public void setPainting(boolean painting) {
		this.painting = painting;
	}

	public boolean isWalls() {
		return walls;
	}

	public void setWalls(boolean walls) {
		this.walls = walls;
	}

	public boolean isFrontDoor() {
		return frontDoor;
	}

	public void setFrontDoor(boolean frontDoor) {
		this.frontDoor = frontDoor;
	}

	public boolean isIndorDoor() {
		return indorDoor;
	}

	public void setIndorDoor(boolean indorDoor) {
		this.indorDoor = indorDoor;
	}

	public int getWallsNumber() {
		return wallsNumber;
	}

	public void setWallsNumber(int wallsNumber) {
		this.wallsNumber = wallsNumber;
	}

	public int getIndrDoorNumber() {
		return indrDoorNumber;
	}

	public void setIndrDoorNumber(int indrDoorNumber) {
		this.indrDoorNumber = indrDoorNumber;
	}

	public boolean isWindow() {
		return window;
	}

	public void setWindow(boolean window) {
		this.window = window;
	}

	public int getWindowNumber() {
		return windowNumber;
	}

	public void setWindowNumber(int windowNumber) {
		this.windowNumber = windowNumber;
	}

	public boolean isChangeHeatingSystem() {
		return changeHeatingSystem;
	}

	public void setChangeHeatingSystem(boolean changeHeatingSystem) {
		this.changeHeatingSystem = changeHeatingSystem;
	}

	public boolean isElectricity() {
		return electricity;
	}

	public void setElectricity(boolean electricity) {
		this.electricity = electricity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
