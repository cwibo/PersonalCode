package MobilePhone;/*
1.  Implement the master class MobilePhone.MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    -  And seven methods, they are (their functions are in their names):
        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact)
        and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
    Contact List:
    1. Bob -> 31415926
    2. Alice -> 16180339
    3. Tom -> 11235813
    4. Jane -> 23571113

TIP:  In MobilePhone.MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
TIP:  Two Contact objects are equal if they have the same name.
TIP:  Be extremely careful about spaces in the printed message.
NOTE:  All fields are private.
NOTE:  Constructors should be defined as public.
NOTE:  All methods should be defined as public (except for the two findContact() methods which are private).
NOTE:  Do not add a main method to the solution code.
NOTE:  If you get an error from the Evaluate class, it's most likely the constructor.
 Check if you've added a constructor or if the constructor has the right arguments.
 */

import java.util.ArrayList;


public class MobilePhone {
    private String myNumber;
    private static ArrayList<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        MobilePhone.myContacts = myContacts;
    }
    private static int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private static int findContact(String name){
        return myContacts.indexOf(name);
    }
    public static boolean addNewContact(Contact contact){
        if(myContacts.contains(contact)){
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    public static boolean updateContact(Contact old, Contact updating){
        if(findContact(old) >= 0){
            updating.setName(old.getName());
            updating.setPhoneNumber(old.getPhoneNumber());
            return true;
        }
        return false;
    }
    public static boolean removeContact(Contact contact){
        if(!myContacts.contains(contact)){
            return false;
        }
        myContacts.remove(contact);
        return myContacts.contains(contact);
    }

    public static Contact queryContact(String name){

        return myContacts.get(myContacts.indexOf(name));
    }
    public static void printContacts(){
        //1. Bob -> 31415926
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
