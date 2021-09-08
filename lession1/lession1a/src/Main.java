public class Main {
    public static void main(String [] args) {
        ContactManager myContactManager = new ContactManager();

        // Create a new Contact object for Seth
        Contact friendSeth = new Contact();
        // Set the fields
        friendSeth.name = "Seth";
        friendSeth.phoneNumber = "01-718-555-1212";
        // Add Seth Contact to the ContactsManager
        myContactManager.addContact(friendSeth);

        // Create a new Contact object for Kristen
        Contact friendKristen = new Contact();
        // Set the fields
        friendKristen.name = "Kristen";
        friendKristen.email = "kristen@mail.com";
        // Add Seth Contact to the ContactsManager
        myContactManager.addContact(friendKristen);

        // Create a new Contact object for Kristen
        Contact friendMeena = new Contact();
        // Set the fields
        friendMeena.name = "Meena";
        friendMeena.email = "meena@mail.com";
        friendMeena.phoneNumber = "1212-718-917";
        // Add Seth Contact to the ContactsManager
        myContactManager.addContact(friendMeena);

        // Now let's try to search of a contact and display their phone number
        Contact result = myContactManager.searchContact("Seth");
        System.out.println(result.name +" " + result.phoneNumber);
    }
}
