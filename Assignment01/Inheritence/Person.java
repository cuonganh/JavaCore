import java.util.Date;

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private Date dateOfBirth;

    Person() {
        System.out.println("A person is create.");
    }

    Person(String name, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;

        System.out.println("A person is create with name, address, phoneNumber, dateOfBirth");
    }

    //Getter
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /*
    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    */

    //Method of Person class
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String changeAddress(String newAddress) {

        return this.address = newAddress;

    }

    public int calculateAge() {

        return 2021 - dateOfBirth.getYear();

    }

}
