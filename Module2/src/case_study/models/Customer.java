package case_study.models;

import java.util.Date;

public class Customer extends Person {
    private int customerId;
    //typeOfCustomer(Diamond, Platinium, Gold, Silver, Member)
    private String typeOfCustomer;
    private String addressOfCustomer;

    public Customer() {
    }

    public Customer(String name, Date dateOfBirth, String gender, int identityNumber, int phoneNumber, String email, int customerId, String typeOfCustomer, String addressOfCustomer) {
        super(name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.addressOfCustomer = addressOfCustomer;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddressOfCustomer() {
        return addressOfCustomer;
    }

    public void setAddressOfCustomer(String addressOfCustomer) {
        this.addressOfCustomer = addressOfCustomer;
    }
}
