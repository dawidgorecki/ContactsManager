public class ContactsManager
{
    private Contact [] contacts;
    private int contactsCount;

    public ContactsManager() {
        this.contacts = new Contact[100];
        this.contactsCount = 0;
    }

    public void addContact(Contact contact) {
        contacts[contactsCount] = contact;
        contactsCount++;
    }

    public Contact searchContactByName(String searchName) {
        for (int i = 0; i < contactsCount; i++) {
            if (contacts[i].getName().equals(searchName)) {
                return contacts[i];
            }
        }

        return null;
    }
}
