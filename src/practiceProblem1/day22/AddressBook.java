package practiceProblem1.day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void editContactUsingName(String firstName, String lastName){
        for(Contact c : contacts){
            if(c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)){
                editing(c);
                return;
            }
        }
        System.out.println("Contact Not Found while trying to edit!!!");
    }

    private void editing(Contact contact){
        boolean flag = true;
        while(flag){
            System.out.println("1. First Name");
            System.out.println("2. Last Name ");
            System.out.println("3. Address");
            System.out.println("4. State");
            System.out.println("5. City");
            System.out.println("6. Zip");
            System.out.println("7. Phone Number");
            System.out.println("8. Email");
            System.out.println("Enter ur Choice : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter a First Name to Update");
                    String updateFirstName = sc.next();
                    contact.setFirstName(updateFirstName);
                    break;
                case 2:
                    System.out.println("Enter a Last Name to Update");
                    String updateLastName = sc.next();
                    contact.setLastName(updateLastName);
                    break;
                case 3:
                    System.out.println("Enter a Address to Update");
                    String updateAddress = sc.next();
                    contact.setAdrress(updateAddress);
                    break;
                case 4:
                    System.out.println("Enter a State to Update");
                    String updateState = sc.next();
                    contact.setState(updateState);
                    break;
                case 5:
                    System.out.println("Enter a City to Update");
                    String updateCity = sc.next();
                    contact.setState(updateCity);
                    break;
                case 6:
                    System.out.println("Enter a ZIP to Update");
                    String updateZIP = sc.next();
                    contact.setZip(updateZIP);
                    break;
                case 7:
                    System.out.println("Enter a Phone Number to Update");
                    String updatePhone = sc.next();
                    contact.setPhoneNumber(updatePhone);
                    break;
                case 8:
                    System.out.println("Enter a Email to Update");
                    String updateEmail = sc.next();
                    contact.setEmail(updateEmail);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to Update more??");
            String toUpdate = sc.next();
            if(toUpdate.toLowerCase().equals("no")){
                flag = false;
            }

        }
    }

    public void deleteContactUsingName(String firstName, String lastName){
        for(Contact c : contacts){
            if(c.getFirstName().equals(firstName) && c.getLastName().equals(lastName)){
                contacts.remove(c);
                return;
            }
        }
        System.out.println("Cotact Not Found while trying to delete");
    }


    public void display(){
        for(Contact c : contacts){
            System.out.println(c);
        }
    }

}
