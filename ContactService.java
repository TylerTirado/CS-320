//Tyler Tirado					 CS-320					3-2 Milestone: Contact Service					SNHU 2023

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            return false; // Contact with the same ID already exists
        } else {
            contacts.put(contact.getContactId(), contact);
            return true; // Contact added successfully
        }
    }

    public boolean deleteContact(String contactId) {
        if (contacts.containsKey(contactId)) {
            contacts.remove(contactId);
            return true; // Contact deleted successfully
        } else {
            return false; // Contact not found
        }
    }

    public boolean updateContact(String contactId, String field, String value) {
        if (contacts.containsKey(contactId)) {
            Contact contact = contacts.get(contactId);
            switch (field) {
                case "firstName":
                    contact.setFirstName(value);
                    break;
                case "lastName":
                    contact.setLastName(value);
                    break;
                case "phone": 
                    contact.setPhone(value);
                    break;
                case "address":
                    contact.setAddress(value);
                    break;
                default:
                    return false; // Invalid field name
            }
            return true; // Contact updated successfully
        } else {
            return false; // Contact not found
        }
    }
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}