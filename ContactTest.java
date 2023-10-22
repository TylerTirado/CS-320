//Tyler Tirado					 CS-320					3-2 Milestone: Contact Service					SNHU 2023

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ContactTest {
    private Contact contact;

    @Before
    public void setUp() {
        contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    public void testValidContactCreation() {
        assertNotNull(contact);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullContactId() {
        new Contact(null, "John", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongContactId() {
        new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullFirstName() {
        new Contact("1234567890", null, "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongFirstName() {
        new Contact("1234567890", "JohnSmithLongFirstName", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullLastName() {
        new Contact("1234567890", "John", null, "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongLastName() {
        new Contact("1234567890", "John", "DoeLongLastName", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullPhone() {
        new Contact("1234567890", "John", "Doe", null, "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPhone() {
        new Contact("1234567890", "John", "Doe", "12345", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullAddress() {
        new Contact("1234567890", "John", "Doe", "1234567890", null);
    }

    @Test
    public void testValidSetter() {
        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());
    }
}