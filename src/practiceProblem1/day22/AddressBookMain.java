package practiceProblem1.day22;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressBookMain {
    Map<String, AddressBook> addressBookMap = new HashMap<>();


    public void addContact(String name){
        if(addressBookMap.containsKey(name)){
            System.out.println("This Name is already exists!!");
        } else {
            addressBookMap.put(name,new AddressBook());
            System.out.println("Address Book '"+name+"' created");
        }
    }

    public AddressBook getAddressBook(String key){
        return addressBookMap.get(key);
    }




    public static void main(String[] args) {
        System.out.println("===Wecome to Address Book System===");

        AddressBookMain system = new AddressBookMain();
        system.addContact("Personal");
        AddressBook addressBook = system.getAddressBook("Personal");

        Contact c1 = new Contact("John", "Doe", "123 Main St", "Springfield", "IL", "62701", "555-0101", "john.doe@example.com");
        Contact c2 = new Contact("Jane", "Smith", "456 Oak Ave", "Austin", "TX", "73301", "555-0102", "jane.smith@example.com");

        addressBook.addContact(c1);
        addressBook.addContact(c2);

        addressBook.editContactUsingName("John","Doe");
        addressBook.display();

        addressBook.deleteContactUsingName("Jane","Smith");

        addressBook.display();


    }
}
