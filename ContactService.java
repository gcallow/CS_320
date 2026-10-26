import java.util.HashMap;

/*
 * Manages Contact Objects.
 * Includes: ADD, UPDATE, and DELETE functionality 
 */
public class ContactService {

	//In-Memory data storage for contacts, keyed by unique contactID
	private final HashMap<String, Contact> contacts = new HashMap<>();
	
	/*
	 * Add new contact for storing
	 */
	public void addContact(Contact newContact) {
		if (contacts.containsKey(newContact.getContactID())) {
			throw new IllegalArgumentException("Contact ID already exists/used");
		}
		contacts.put(newContact.getContactID(), newContact);
	}
	
	/*
	 * Delete contact from storage based on ID
	 */
	public void deleteContact(String oldID) {
		if (!contacts.containsKey(oldID)) {
			throw new IllegalArgumentException("Contact ID not found for deletion");
		}
		contacts.remove(oldID);
	}
	
	/*
	 * Update firstName field for contact record
	 */
	public void updateFirstName(String newName, String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact not found for UPDATE");
		}
		
		//Get the correct contact and update the correct field
		contacts.get(contactID).setFirstName(newName);
	}
	
	/*
	 * Update lastName field for contact record
	 */
	public void updateLastName(String newName, String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact not found for UPDATE");
		}
		
		//Get the correct contact and update the correct field
		contacts.get(contactID).setLastName(newName);
	}
	
	/*
	 * Update phone field for contact record
	 */
	public void updatePhone(String newPhone, String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact not found for UPDATE");
		}
		
		//Get the correct contact and update the correct field
		contacts.get(contactID).setPhone(newPhone);
	}
	
	/*
	 * Update address field for contact record
	 */
	public void updateAddress(String newAddress, String contactID) {
		if (!contacts.containsKey(contactID)) {
			throw new IllegalArgumentException("Contact not found for UPDATE");
		}
		
		//Get the correct contact and update the correct field
		contacts.get(contactID).setAddress(newAddress);
	}
}
