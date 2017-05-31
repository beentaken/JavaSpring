package spring.patient.patientHello;

public class Patient {

	private int id;
	private String name;
	private int nationID;
	private Address address;

	public int getNationID() {
		return nationID;
	}

	public void setNationID(int nationID) {
		this.nationID = nationID;
	}

	public Patient() {

	}
	
	public void onCreate(){
		System.out.println(" <<<<Patient Created>>> "  + this);
	}
	
	public void onDestroy(){
		System.out.println(" <<<<Patient Destroyed>>> " );
	}
	

	public Patient(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", nationID=" + nationID + ", address=" + address + "]";
	}

	public void speak() {
		System.out.println("<<< MY name is  Sohel Sorowar >>>> !");
	}
}
