public class ContactManager {
    // fields
    Contact [] myFriends; // array of contacts
    int friendsCount; // length of array

    // constructor
    ContactManager(){
        friendsCount = 0; // initialize count 0
        myFriends = new Contact[500]; // initialize array of lenght 500
    }

    // methods
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact; //  add contact to array at position fiendsCount
        friendsCount ++;
    }

    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if(myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
        return null;
    }
}