package GameDemo;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationallyId;
	private String birthYear;
	public Customer(int id, String firstName, String lastName, String nationallyId, String birthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationallyId = nationallyId;
		this.birthYear = birthYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNationallyId() {
		return nationallyId;
	}
	public void setNationallyId(String nationallyId) {
		this.nationallyId = nationallyId;
	}
	public String getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}
	
	
}
