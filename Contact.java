public class Contact {
    private int id;
    private String name;
    private long phoneNumber;
    private String email;

    Contact(int id, String name, long phoneNumber, String email){
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    int getId(){
        return id;
    }
    void setId(int id){
        this.id=id;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email=email;
    }

    long getPhoneNumber(){
        return phoneNumber;
    }
    void setPhoneNumber(long phone_num){
        this.phoneNumber=phone_num;
    }

    @Override
    public String toString(){
        return "Id: "+id+"\nName: "+name+"\nPhone Number: "+phoneNumber+"\nEmail: "+email;
    }
}
