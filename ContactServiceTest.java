import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	private ContactService contacts;
	
	//Construct Fresh contacts field each Test
	@BeforeEach
	public void setUp() {
		contacts = new ContactService();
	}
	
	// Contact Service [ADD] functionality test
	@Test
	public void testAddContact() {
		// Test contacts are added and duplicates are rejected
		Contact contact = new Contact("117", "John", "Spartan", "1234567890", "123 Piper St");
		contacts.addContact(contact);
		assertThrows(IllegalArgumentException.class, ()-> {
			contacts.addContact(contact);
		});
	}
	
	// Contact Service [DELETE] functionality tests
	@Test
	public void testDeleteContact() {
		Contact contact = new Contact("123", "Brian", "Cox", "1234567890", "123 Science st");
		contacts.addContact(contact);
		contacts.deleteContact("123");
		assertThrows(IllegalArgumentException.class,() -> {
			contacts.deleteContact("123");
		});
	}
	
	@Test
	public void testDeleteMIAContact() {
		assertThrows(IllegalArgumentException.class, () -> {
			contacts.deleteContact("123");
		});
	}
	
	// Contact Service [UPDATE] functionality tests
	@Test
	public void testUpdateMissingContact() {
		assertThrows(IllegalArgumentException.class, () -> {
			contacts.updateFirstName("Timmy", "12345");
		});
	}
	
	@Test
	public void testUpdateFname() {
		Contact contact = new Contact("123", "Jason", "Rolly", "1234567890", "123 boring st");
		contacts.addContact(contact);
		contacts.updateFirstName("John", "123");
		assertEquals("John", contact.getFirstName());
	}
	
	@Test
	public void testUpdateLname() {
		Contact contact = new Contact("123", "Jason", "Rolly", "1234567890", "123 boring st");
		contacts.addContact(contact);
		contacts.updateLastName("Rocker", "123");
		assertEquals("Rocker", contact.getLastName());
	}
	
	@Test
	public void testUpdateAddress() {
		Contact contact = new Contact("123", "Jason", "Rolly", "1234567890", "123 boring st");
		contacts.addContact(contact);
		contacts.updateAddress("123 Juniper St", "123");
		assertEquals("123 Juniper St", contact.getAddress());
	}
	
	@Test
	public void testUpdatePhone() {
		Contact contact = new Contact("123", "Jason", "Rolly", "1234567890", "123 boring st");
		contacts.addContact(contact);
		contacts.updatePhone("0987654321", "123");
		assertEquals("0987654321", contact.getPhone());
	}
}
