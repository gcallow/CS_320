import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

	//Valid Contact Tests
	@Test 
	public void testValidContact() {
		Contact contact = new Contact("1112223334", "Brian", "Gunderson", "6031234567", "50 Bird St");
		assertEquals("1112223334", contact.getContactID());
		assertEquals("Brian", contact.getFirstName());
		assertEquals("Gunderson", contact.getLastName());
		assertEquals("6031234567", contact.getPhone());
		assertEquals("50 Bird St", contact.getAddress());
	}
	
	@Test 
	public void testValidContact2() {
		Contact contact = new Contact("1", "A", "B", "1234567890", "123456789012345678901234567890");
		assertEquals("1", contact.getContactID());
		assertEquals("A", contact.getFirstName());
		assertEquals("B", contact.getLastName());
		assertEquals("1234567890", contact.getPhone());
		assertEquals("123456789012345678901234567890", contact.getAddress());
	}
	
	//Invalid ContactID
	@Test
	public void testIDNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "William", "Rock", "1234567890", "123 Oak St");
		});
	}
	
	@Test
	public void testIDLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890a", "Ryan", "Air", "1234567890", "123 Super busy st");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789009876543211234567890", "Bob", "Builder", "abcdefghij", "123 street st");
		});
	}
	
	//Invalid First Name 
	@Test
	public void testFirstNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", null, "Gunderson", "6031234567", "50 Bird St");
		});
	}
	
	@Test
	public void testFirstNameLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "BrianBrianBrian", "Gunderson", "6031234567", "50 Bird St");
		});
	}
	
	//Invalid Last Name
	@Test
	public void testLastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", null, "6031234567", "50 Bird St");
		});
	}
	
	@Test
	public void testLastNameLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "GundersonGunderson", "6031234567", "50 Bird St");
		});
	}
	
	//Invalid Phone
	@Test
	public void testPhoneNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "Gunderson", null, "50 Bird St");
		});
	}
	
	@Test
	public void testPhoneExact() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "Gunderson", "603123456", "50 Bird St");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "Gunderson", "60312345678", "50 Bird St");
		});
	}
	
	//Invalid Address
	@Test
	public void testAddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "Gunderson", "6031234567", null);
		});
	}
	
	@Test
	public void testAddressLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1112223334", "Brian", "Gunderson", "6031234567", "5000 Bird Megapolis Street of Fun");
		});
	}
}
