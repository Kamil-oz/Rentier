package rentier.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomewarePrices {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String label;
	private BigDecimal bedCost;
	private String bedLink;
	private BigDecimal wardrobeCost;
	private String wardrobeLink;
	private BigDecimal chairCost;
	private String chairLink;
	private BigDecimal deskCost;
	private String deskLink;
	private BigDecimal vacumcleanerCost;
	private String vacumcleanerLink;
	private BigDecimal cleaningSuppliesCost;
	private String cleaningSuppliesLink;
	private BigDecimal kitchenSuppliesCost;
	private String kitchenSuppliesLink;
	private BigDecimal washingMachineCost;
	private String washingMachineLink;
	private BigDecimal dryierCost;
	private String dryierLink;
	private BigDecimal owenCost;
	private String owenLink;
	private BigDecimal microwaveCost;
	private String microwaveLink;
	private BigDecimal fidgeCost;
	private String fidgeLink;
	private BigDecimal kitchenTableCost;
	private String kitchenTableLink;
	private BigDecimal kettleCost;
	private String kettleLink;
	private BigDecimal cabinetCost;
	private String cabinetLink;

	
	public HomewarePrices() {
		super();
		this.bedCost = BigDecimal.ZERO;
		this.wardrobeCost = BigDecimal.ZERO;
		this.chairCost = BigDecimal.ZERO;
		this.deskCost = BigDecimal.ZERO;
		this.vacumcleanerCost = BigDecimal.ZERO;
		this.cleaningSuppliesCost = BigDecimal.ZERO;
		this.kitchenSuppliesCost = BigDecimal.ZERO;
		this.washingMachineCost = BigDecimal.ZERO;
		this.dryierCost = BigDecimal.ZERO;
		this.owenCost = BigDecimal.ZERO;
		this.microwaveCost = BigDecimal.ZERO;
		this.fidgeCost = BigDecimal.ZERO;
		this.kitchenTableCost = BigDecimal.ZERO;
		this.kettleCost = BigDecimal.ZERO;
		this.cabinetCost = BigDecimal.ZERO;
	}

	


	public String getLabel() {
		return label;
	}




	public void setLabel(String label) {
		this.label = label;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBedCost() {
		return bedCost;
	}

	public void setBedCost(BigDecimal bedCost) {
		this.bedCost = bedCost;
	}

	public String getBedLink() {
		return bedLink;
	}

	public void setBedLink(String bedLink) {
		this.bedLink = bedLink;
	}

	public BigDecimal getWardrobeCost() {
		return wardrobeCost;
	}

	public void setWardrobeCost(BigDecimal wardrobeCost) {
		this.wardrobeCost = wardrobeCost;
	}

	public String getWardrobeLink() {
		return wardrobeLink;
	}

	public void setWardrobeLink(String wardrobeLink) {
		this.wardrobeLink = wardrobeLink;
	}

	public BigDecimal getChairCost() {
		return chairCost;
	}

	public void setChairCost(BigDecimal chairCost) {
		this.chairCost = chairCost;
	}

	public String getChairLink() {
		return chairLink;
	}

	public void setChairLink(String chairLink) {
		this.chairLink = chairLink;
	}

	public BigDecimal getDeskCost() {
		return deskCost;
	}

	public void setDeskCost(BigDecimal deskCost) {
		this.deskCost = deskCost;
	}

	public String getDeskLink() {
		return deskLink;
	}

	public void setDeskLink(String deskLink) {
		this.deskLink = deskLink;
	}

	public BigDecimal getVacumcleanerCost() {
		return vacumcleanerCost;
	}

	public void setVacumcleanerCost(BigDecimal vacumcleanerCost) {
		this.vacumcleanerCost = vacumcleanerCost;
	}

	public String getVacumcleanerLink() {
		return vacumcleanerLink;
	}

	public void setVacumcleanerLink(String vacumcleanerLink) {
		this.vacumcleanerLink = vacumcleanerLink;
	}

	public BigDecimal getCleaningSuppliesCost() {
		return cleaningSuppliesCost;
	}

	public void setCleaningSuppliesCost(BigDecimal cleaningSuppliesCost) {
		this.cleaningSuppliesCost = cleaningSuppliesCost;
	}

	public String getCleaningSuppliesLink() {
		return cleaningSuppliesLink;
	}

	public void setCleaningSuppliesLink(String cleaningSuppliesLink) {
		this.cleaningSuppliesLink = cleaningSuppliesLink;
	}

	public BigDecimal getKitchenSuppliesCost() {
		return kitchenSuppliesCost;
	}

	public void setKitchenSuppliesCost(BigDecimal kitchenSuppliesCost) {
		this.kitchenSuppliesCost = kitchenSuppliesCost;
	}

	public String getKitchenSuppliesLink() {
		return kitchenSuppliesLink;
	}

	public void setKitchenSuppliesLink(String kitchenSuppliesLink) {
		this.kitchenSuppliesLink = kitchenSuppliesLink;
	}

	public BigDecimal getWashingMachineCost() {
		return washingMachineCost;
	}

	public void setWashingMachineCost(BigDecimal washingMachineCost) {
		this.washingMachineCost = washingMachineCost;
	}

	public String getWashingMachineLink() {
		return washingMachineLink;
	}

	public void setWashingMachineLink(String washingMachineLink) {
		this.washingMachineLink = washingMachineLink;
	}

	public BigDecimal getDryierCost() {
		return dryierCost;
	}

	public void setDryierCost(BigDecimal dryierCost) {
		this.dryierCost = dryierCost;
	}

	public String getDryierLink() {
		return dryierLink;
	}

	public void setDryierLink(String dryierLink) {
		this.dryierLink = dryierLink;
	}

	public BigDecimal getOwenCost() {
		return owenCost;
	}

	public void setOwenCost(BigDecimal owenCost) {
		this.owenCost = owenCost;
	}

	public String getOwenLink() {
		return owenLink;
	}

	public void setOwenLink(String owenLink) {
		this.owenLink = owenLink;
	}

	public BigDecimal getMicrowaveCost() {
		return microwaveCost;
	}

	public void setMicrowaveCost(BigDecimal microwaveCost) {
		this.microwaveCost = microwaveCost;
	}

	public String getMicrowaveLink() {
		return microwaveLink;
	}

	public void setMicrowaveLink(String microwaveLink) {
		this.microwaveLink = microwaveLink;
	}

	public BigDecimal getFidgeCost() {
		return fidgeCost;
	}

	public void setFidgeCost(BigDecimal fidgeCost) {
		this.fidgeCost = fidgeCost;
	}

	public String getFidgeLink() {
		return fidgeLink;
	}

	public void setFidgeLink(String fidgeLink) {
		this.fidgeLink = fidgeLink;
	}

	public BigDecimal getKitchenTableCost() {
		return kitchenTableCost;
	}

	public void setKitchenTableCost(BigDecimal kitchenTableCost) {
		this.kitchenTableCost = kitchenTableCost;
	}

	public String getKitchenTableLink() {
		return kitchenTableLink;
	}

	public void setKitchenTableLink(String kitchenTableLink) {
		this.kitchenTableLink = kitchenTableLink;
	}

	public BigDecimal getKettleCost() {
		return kettleCost;
	}

	public void setKettleCost(BigDecimal kettleCost) {
		this.kettleCost = kettleCost;
	}

	public String getKettleLink() {
		return kettleLink;
	}

	public void setKettleLink(String kettleLink) {
		this.kettleLink = kettleLink;
	}

	public BigDecimal getCabinetCost() {
		return cabinetCost;
	}

	public void setCabinetCost(BigDecimal cabinetCost) {
		this.cabinetCost = cabinetCost;
	}

	public String getCabinetLink() {
		return cabinetLink;
	}

	public void setCabinetLink(String cabinetLink) {
		this.cabinetLink = cabinetLink;
	}

}
