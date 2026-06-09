package practiceProblem1.day22;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

}
