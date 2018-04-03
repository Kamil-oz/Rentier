package rentier.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author kamil
 *
 */
@Entity
public class Flat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String label;
	
	private String address;
	// google

	private BigDecimal price;
	
	private int bedrooms;

	private BigDecimal area;

	@Column(columnDefinition = "TEXT")
	private String description;

	private String contact;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "condition_id")
	FlatCondition flatCondition;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "homeware_id")
	Homeware homeware;
 
	public String getDetails() {
		return label+" "+address;
	}
	public FlatCondition getFlatCondition() {
		return flatCondition;
	}

	public void setFlatCondition(FlatCondition flatCondition) {
		this.flatCondition = flatCondition;
	}

	public Homeware getHomeware() {
		return homeware;
	}

	public void setHomeware(Homeware homeware) {
		this.homeware = homeware;
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getArea() {
		return area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

}