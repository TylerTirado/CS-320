//Tyler Tirado					 CS-320					3-2 Milestone: Contact Service					SNHU 2023

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ContactServiceTest {
    private ContactService contactService;

    @Before
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
    }

    @Test
    public void testAddDuplicateContact() {
        Contact contact1 = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("1", "Jane", "Smith", "9876543210", "456 Elm St");
        assertTrue(contactService.addContact(contact1));
        assertFalse(contactService.addContact(contact2)); // Should return false for duplicate ID
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertTrue(contactService.deleteContact("1"));
        assertFalse(contactService.deleteContact("1")); // Should return false for already deleted contact
    }

    @Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertTrue(contactService.updateContact("1", "firstName", "Jane"));
        assertEquals("Jane", contactService.getContact("1").getFirstName());
    }

    @Test
    public void testUpdateLastName() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertTrue(contactService.updateContact("1", "lastName", "Smith"));
        assertEquals("Smith", contactService.getContact("1").getLastName());
    }

    @Test
    public void testUpdatePhone() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertTrue(contactService.updateContact("1", "phone", "9876543210"));
        assertEquals("9876543210", contactService.getContact("1").getPhone());
    }

    @Test
    public void testUpdateAddress() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
        assertTrue(contactService.updateContact("1", "address", "456 Elm St"));
        assertEquals("456 Elm St", contactService.getContact("1").getAddress());
    }
}