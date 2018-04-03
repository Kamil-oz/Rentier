package rentier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Homeware {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private int numberOfBedsToBuy;
	private int numberOfWardrobesToBuy;
	private int numberOfChairsToBuy;
	private int numberOfDesksToBuy;
	private boolean vacumcleaner;
	private boolean cleaningSupplies;
	private boolean kitchenSupplies;
	private boolean washingMachine;
	private boolean dryier;
	private boolean owen;
	private boolean microwave;
	private boolean fidge;
	private boolean kitchenTable;
	private boolean kettle;
	private boolean cabinet;
	

	public boolean isKitchenTable() {
		return kitchenTable;
	}

	public void setKitchenTable(boolean kitchenTable) {
		this.kitchenTable = kitchenTable;
	}

	// zapytać

	public boolean isCleaningSupplies() {
		return cleaningSupplies;
	}

	public void setCleaningSupplies(boolean cleaningSupplies) {
		this.cleaningSupplies = cleaningSupplies;
	}

	public boolean isDryier() {
		return dryier;
	}

	public void setDryier(boolean dryier) {
		this.dryier = dryier;
	}

	public boolean isMicrowave() {
		return microwave;
	}

	public void setMicrowave(boolean microwave) {
		this.microwave = microwave;
	}

	public boolean isFidge() {
		return fidge;
	}

	public void setFidge(boolean fidge) {
		this.fidge = fidge;
	}

	public boolean isKettle() {
		return kettle;
	}

	public void setKettle(boolean kettle) {
		this.kettle = kettle;
	}

	public boolean isCabinet() {
		return cabinet;
	}

	public void setCabinet(boolean cabinet) {
		this.cabinet = cabinet;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumberOfBedsToBuy() {
		return numberOfBedsToBuy;
	}

	public void setNumberOfBedsToBuy(int numberOfBedsToBuy) {
		this.numberOfBedsToBuy = numberOfBedsToBuy;
	}

	public int getNumberOfWardrobesToBuy() {
		return numberOfWardrobesToBuy;
	}

	public void setNumberOfWardrobesToBuy(int numberOfWardrobesToBuy) {
		this.numberOfWardrobesToBuy = numberOfWardrobesToBuy;
	}

	public int getNumberOfChairsToBuy() {
		return numberOfChairsToBuy;
	}

	public void setNumberOfChairsToBuy(int numberOfChairsToBuy) {
		this.numberOfChairsToBuy = numberOfChairsToBuy;
	}

	public int getNumberOfDesksToBuy() {
		return numberOfDesksToBuy;
	}

	public void setNumberOfDesksToBuy(int numberOfDesksToBuy) {
		this.numberOfDesksToBuy = numberOfDesksToBuy;
	}

	public boolean isVacumcleaner() {
		return vacumcleaner;
	}

	public void setVacumcleaner(boolean vacumcleaner) {
		this.vacumcleaner = vacumcleaner;
	}

	public boolean isKitchenSupplies() {
		return kitchenSupplies;
	}

	public void setKitchenSupplies(boolean kitchenSupplies) {
		this.kitchenSupplies = kitchenSupplies;
	}

	public boolean isWashingMachine() {
		return washingMachine;
	}

	public void setWashingMachine(boolean washingMachine) {
		this.washingMachine = washingMachine;
	}

	public boolean isOwen() {
		return owen;
	}

	public void setOwen(boolean owen) {
		this.owen = owen;
	}

}
