//Tyler Tirado					 CS-320					3-2 Milestone: Contact Service					SNHU 2023
public class Contact {
    private final String contactId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID must be a non-null string of up to 10 characters.");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must be a non-null string of up to 10 characters.");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must be a non-null string of up to 10 characters.");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be a 10-digit string.");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must be a non-null string of up to 30 characters.");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new IllegalArgumentException("First name cannot be null.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new IllegalArgumentException("Last name cannot be null.");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be a non-null 10-digit string.");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null.");
        }
        this.address = address;
    }
}