import java.util.HashMap;

public class ContactService {
    private HashMap<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    // Add contact
    public boolean addContact(Contact contact) {
        if (!contacts.containsKey(contact.getContactID())) {
            contacts.put(contact.getContactID(), contact);
            return true;
        }
        return false; // Contact already exists
    }

    // Delete contact
    public boolean deleteContact(String contactID) {
        if (contacts.containsKey(contactID)) {
            contacts.remove(contactID);
            return true;
        }
        return false; // No contact found with given ID
    }

    // Update contact fields
    public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactID);
        if (contact != null) {
            if (firstName != null) contact.setFirstName(firstName);
            if (lastName != null) contact.setLastName(lastName);
            if (phone != null) contact.setPhone(phone);
            if (address != null) contact.setAddress(address);
            return true;
        }
        return false; // No contact found with given ID
    }

    // Get all contacts (for testing)
    public HashMap<String, Contact> getAllContacts() {
        return contacts;
    }
}
