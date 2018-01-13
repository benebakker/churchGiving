
public class Donation {
	
	Donor donor;
	String category;
	String description;
	Integer amount;
	
	
	public Donation(Donor donor, String category, String description, Integer amount) {
		super();
		this.donor = donor;
		this.category = category;
		this.description = description;
		this.amount = amount;
	}
	
	public Donation(Donor donor) {
		super();
		this.donor=donor;
		category="";
		description="";
		amount=0;
	}
	
	public Donation() {
		super();
		this.donor=null;
		category="";
		description="";
		amount=0;	
	}
	
	public Donor getDonor() {
		return donor;
	}
	public void setDonor(Donor donor) {
		this.donor = donor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	

}
