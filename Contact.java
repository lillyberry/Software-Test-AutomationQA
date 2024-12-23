public class Contact {
    private final String contactID; // unique and immutable
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phone, String address) throws IllegalArgumentException {
        // Validate and set contact fields
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Contact ID must not be null and cannot be longer than 10 characters.");
        }
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("First name must not be null and cannot be longer than 10 characters.");
        }
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name must not be null and cannot be longer than 10 characters.");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone must contain exactly 10 digits.");
        }
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Address must not be null and cannot be longer than 30 characters.");
        }

        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() <= 10) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Invalid first name.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() <= 10) {
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Invalid last name.");
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d{10}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone number.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && address.length() <= 30) {
            this.address = address;
        } else {
            throw new IllegalArgumentException("Invalid address.");
        }
    }
}
