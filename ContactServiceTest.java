/**
 * Author: Tariq Mack
 * Description: This class is part of the Contact Service application for managing contact data.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("003", "Alice", "Brown", "0987654321", "456 Elm St");
        service.addContact(contact);
        assertEquals("Alice", service.getContact("003").getFirstName());
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("004", "Bob", "White", "0123456789", "789 Pine St");
        service.addContact(contact);
        service.deleteContact("004");
        assertNull(service.getContact("004"));
    }

    @Test
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("005", "Eve", "Black", "9999999999", "321 Oak St");
        service.addContact(contact);
        service.updateFirstName("005", "Eva");
        assertEquals("Eva", service.getContact("005").getFirstName());
    }
}
