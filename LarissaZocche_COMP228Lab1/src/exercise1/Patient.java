package exercise1;
//this class describes patient information
//
public class Patient 
{
	//declare instance variables
	private String patientId, firstName, lastName, address, city, province, postalCode;
	
	//multiple argument constructor
	public Patient (String patientID, String firstName, String lastName, String address, String city, String province, String postalCode)
	{
		this.patientId = patientID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}

	//default (no argument) constructor (to interact with the user without initialize the variables, initialize the variables with the default values)
	public Patient ()
	{
		//
	}
	
	//get and set for Patient ID
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	//get and set for first name
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	// get and set for last name
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	//get and set for address
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	//get and set for city
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	//get and set for province
	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	//get and set for postal code
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	//method to return patient info in a nice format
	public String getPatientInfo(){
		return "Patient ID: " + patientId +
				"\nFirst Name: " + firstName +
				"\nLast Name: " + lastName +
				"\nAddress: " + address +
				"\nCity: " + city +
				"\nProvince: " + province +
				"\nPostal Code: " + postalCode;
	}
	
	
}
