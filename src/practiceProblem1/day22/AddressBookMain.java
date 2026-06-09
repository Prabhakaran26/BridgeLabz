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
//        Contact c3 = new Contact("Michael", "Johnson", "789 Pine Rd", "Seattle", "WA", "98101", "555-0103", "mjohnson@example.com");
//        Contact c4 = new Contact("Emily", "Davis", "321 Maple Blvd", "Denver", "CO", "80201", "555-0104", "emily.davis@example.com");
//        Contact c5 = new Contact("David", "Wilson", "654 Cedar Ln", "Miami", "FL", "33101", "555-0105", "dwilson@example.com");

        addressBook.addContact(c1);
        addressBook.addContact(c2);


    }
}
