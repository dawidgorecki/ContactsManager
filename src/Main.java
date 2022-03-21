public class Main
{
    public static void main(String [] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.setName("Dawid");
        contact1.setEmail("dawid@gmail.com");
        contact1.setPhoneNumber("600500400");

        Contact contact2 = new Contact();
        contact2.setName("Adam");
        contact2.setEmail("adam@gmail.com");
        contact2.setPhoneNumber("500400300");

        myContactsManager.addContact(contact1);
        myContactsManager.addContact(contact2);

        Contact search = myContactsManager.searchContactByName("Ada");

        if (search == null)  {
            System.out.println("Not found");
        } else {
            System.out.println("Name: " + search.getName() + ", email: " +
                    search.getEmail() + ", phone: " + search.getPhoneNumber());
        }
    }
}
