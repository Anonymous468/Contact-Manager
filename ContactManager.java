import java.util.ArrayList;

public class ContactManager {
    static ArrayList<Contact> contacts=new ArrayList<>();

    static void addContact(Contact c){
        contacts.add(c);
        System.out.println("Contact added");
    }

    static void searchByName(String name){
        int ctr=0;
        for(Contact i:contacts){
            if(i.getName().equals(name)){
                System.out.println(i);
                ctr++;
            }
        }
        if(ctr==0){
            System.out.println("Contact not found");
        }
    }

    static void searchByNumber(long number){
        for(Contact i:contacts){
            if(i.getPhoneNumber()==number){
                System.out.println(i);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    static void deleteById(int id){
        for(Contact i:contacts){
            if(i.getId()==id){
                contacts.remove(i);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    static void updateContact(int id, String name, long phoneNumber, String email){
        for(Contact i:contacts){
            if(i.getId()==id){
                i.setName(name);
                i.setPhoneNumber(phoneNumber);
                i.setEmail(email);
                System.out.println("Contact updated");
                return;
            }
        }
        System.out.println("Contact not found");
    }
}
