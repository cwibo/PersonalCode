package MobilePhone;
import MobilePhone.MobilePhone;
public class Evaluate {
    public static void main(String[] args) {
        Contact James = new Contact("James", "123-456789");
        MobilePhone.addNewContact(James);
        Contact Henry = new Contact("Henry", "321-654958");
        Contact Theodore = new Contact("Theodore", "659-396-456");
        MobilePhone.addNewContact(Henry);
        MobilePhone.addNewContact(Theodore);
        MobilePhone.printContacts();
        MobilePhone.removeContact(Theodore);
        MobilePhone.printContacts();
        System.out.println();
    }
}
