/*
 * Represents a Contact Object for Module Three
 * 
 * Author: Gavin C
 */
public class Contact {
	
	//Contact ID is not to be updated after initialization; final variable
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/*
	 * Constructor Call for a Contact
	 * 
	 * @param contactID: Unique value, Max 10 characters, Not null
	 * @param firstName: Max 10 characters, Not null
	 * @param lastName: Max 10 characters, Not null
	 * @param phone: Exactly 10 characters, Not null
	 * @param address: Max 30 characters, Not null
	 * 
	 */
	public Contact(String contactID, String firstName, String lastName,
			       String phone, String address) {
		
		//Make validation checks to contact arguments
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		// Initializes Variables
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	
	//Getter methods for accessing private variables
	public String getContactID() {
		return contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	//Setter methods for setting values of private variables. 
	//Includes variable validation
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length()> 10) {
			throw new IllegalArgumentException("invalid last name");
		}
		this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		if (address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
}
