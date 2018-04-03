package rentier.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Ofer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "flat_id")
	private Flat flat;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "renovation_id")
	private Renovation renovation;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "homeware_prices_id")
	private HomewarePrices homewarePrices;

	private String notes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	public Renovation getRenovation() {
		return renovation;
	}

	public void setRenovation(Renovation renovation) {
		this.renovation = renovation;
	}

	public HomewarePrices getHomewarePrices() {
		return homewarePrices;
	}

	public void setHomewarePrices(HomewarePrices homewarePrices) {
		this.homewarePrices = homewarePrices;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
