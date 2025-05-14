import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id, size;
        String name, email;
        long ph_num;
        boolean result;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
        while(flag) {
            System.out.println("1) Add contact\n2) Search by Name\n3) Search by Number\n4) Delete by Id\n5) Update Contact\n6) Exit\n\nChoose:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    name = sc.nextLine();
                    //sc.nextLine();
                    result = Sanitizer.sanitize_name(name);
                    if (result == false) {
                        System.out.println("Name cannot have spaces and digits");
                        break;
                    }
                    System.out.print("\nEnter Phone Number: ");
                    ph_num = sc.nextLong();
                    sc.nextLine();
                    result = Sanitizer.sanitize_ph_num(ph_num);
                    if (result == false) {
                        System.out.println("Phone Number has to be 10 digits long");
                        break;
                    }
                    System.out.print("\nEnter Email: ");
                    email = sc.nextLine();
                    System.out.println();
                    if(!email.isEmpty()){
                        result = Sanitizer.sanitize_email(email);
                        if (result == false) {
                            System.out.println("Email format is wrong");
                            break;
                        }
                    }
                    else{
                        email=null;
                    }
                    size = ContactManager.contacts.size();
                    id = size + 1;
                    ContactManager.addContact(new Contact(id, name, ph_num, email));
                    break;
                case 2:
                    System.out.println("Enter contact name to search:");
                    name = sc.nextLine();
                    //sc.nextLine();
                    result = Sanitizer.sanitize_name(name);
                    if (result == false) {
                        System.out.println("Name cannot have spaces and digits");
                        break;
                    }
                    ContactManager.searchByName(name);
                    break;
                case 3:
                    System.out.println("Enter phone number to search:");
                    ph_num = sc.nextLong();
                    sc.nextLine();
                    result = Sanitizer.sanitize_ph_num(ph_num);
                    if (result == false) {
                        System.out.println("Phone Number has to be 10 digits long");
                        break;
                    }
                    ContactManager.searchByNumber(ph_num);
                    break;
                case 4:
                    System.out.println("Enter contact Id to delete:");
                    id = sc.nextInt();
                    sc.nextLine();
                    ContactManager.deleteById(id);
                    break;
                case 5:
                    System.out.print("Enter contact Id to update: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\nEnter new name: ");
                    name = sc.nextLine();
                    //sc.nextLine();
                    result = Sanitizer.sanitize_name(name);
                    if (result == false) {
                        System.out.println("Name cannot have spaces and digits");
                        break;
                    }
                    System.out.print("\nEnter new phone number: ");
                    ph_num = sc.nextLong();
                    sc.nextLine();
                    result = Sanitizer.sanitize_ph_num(ph_num);
                    if (result == false) {
                        System.out.println("Phone Number has to be 10 digits long");
                        break;
                    }
                    System.out.print("\nEnter new email: ");
                    email = sc.nextLine();
                    System.out.println();
                    if(!email.isEmpty()){
                        result = Sanitizer.sanitize_email(email);
                        if (result == false) {
                            System.out.println("Email format is wrong");
                            break;
                        }
                    }
                    else{
                        email=null;
                    }
                    ContactManager.updateContact(id, name, ph_num, email);
                    break;
                case 6:
                    flag=false;
                    sc.close();
                    System.out.println("Terminated.");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("-------------------------------------------------------------------");
        }
    }
}