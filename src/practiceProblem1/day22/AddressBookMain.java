package practiceProblem1.day22;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);

    Map<String, AddressBook> addressBookMap = new HashMap<>();


    public void addContactInAddressBookMap(String name){
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

    public void addContact(String name){
        AddressBook addressBook = getAddressBook(name);
        Contact c1 = new Contact("John", "Doe", "123 Main St", "Springfield", "IL", "62701", "555-0101", "john.doe@example.com");
        Contact c2 = new Contact("Jane", "Smith", "456 Oak Ave", "Austin", "TX", "73301", "555-0102", "jane.smith@example.com");
        addressBook.addContact(c1);
        addressBook.addContact(c2);
        addressBook.display();
        System.out.println("Successfully Created!!!");
    }

    public void editContactUsingName(String name){
        AddressBook addressBook = getAddressBook(name);
        addressBook.display();
        System.out.println("Enter the existing FirstName :");
        String firstName = sc.next();
        System.out.println("Enter the existing Last Name :");
        String lastName = sc.next();
        addressBook.editContactUsingName(firstName, lastName);
    }

    public void deleteContactUsingName(String name){
        AddressBook addressBook = getAddressBook(name);
        addressBook.display();
        System.out.println("Enter the existing FirstName :");
        String firstName = sc.next();
        System.out.println("Enter the existing Last Name :");
        String lastName = sc.next();
        addressBook.deleteContactUsingName(firstName, lastName);
    }

    public void displayAddresBook(){
        int i = 1;
        for(String name : addressBookMap.keySet()){
            System.out.println(i+"."+name);
            i++;
        }
    }



    public static void main(String[] args) {
        System.out.println("===Wecome to Address Book System===");

        AddressBookMain system = new AddressBookMain();

        while(true){
            System.out.println("1. Add AddressBook");
            System.out.println("2. Perform Opertions on Particular Address Book");
            System.out.println("3. Exit the Program...");
            System.out.println("Enter ur Choice: ");
            int choice = sc.nextInt();
            String name;
            switch (choice){
                case 1:
                    System.out.println("Enter a Name for Address Book: ");
                    name = sc.next();
                    system.addContactInAddressBookMap(name);
                    break;
                case 2:
                    system.displayAddresBook();
                    name = sc.next();
                    system.optionsToSelect(system, name);
                    break;
                case 3:
                    return;
            }
        }

    }

    public void optionsToSelect(AddressBookMain system,String name){
        while (true) {
            System.out.println("1. Add Contact in '"+name+"' AddressBook");
            System.out.println("2. Edit Contact using their name from '"+name+"'");
            System.out.println("3. Delete Contact using their name from '"+name+"'");
            System.out.println("4. Exit");
            System.out.println("Enter ur Choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    system.addContact(name);
                    break;
                case 2:
                    system.editContactUsingName(name);
                    break;
                case 3:
                    system.deleteContactUsingName(name);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
