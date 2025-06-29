/**
 * Author: Tariq Mack
 * Description: This class is part of the Contact Service application for managing contact data.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact contact = new Contact("001", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("John", contact.getFirstName());
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("002", "Jane", "Smith", "12345", "123 Main St");
        });
    }
}
