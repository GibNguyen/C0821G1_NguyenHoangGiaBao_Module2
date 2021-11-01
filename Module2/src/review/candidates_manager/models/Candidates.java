package review.candidates_manager.models;

public class Candidates {
    private int iD;
    private String firstName;
    private String lastName;
    private int birthDay;
    private String address;
    private String phone;
    private String email;



    public Candidates(int iD, String firstName, String lastName, int birthDay, String address, String phone, String email ) {
        this.iD = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.setPhone(phone);
        this.email = email;


    }

    public Candidates() {
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return this.iD+","+this.firstName+","+this.lastName+","+this.birthDay+","+this.address+","+ this.getPhone() +","+this.email;
    }
}

