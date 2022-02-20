package Homework3;

public class User {
    private String lastName;
    private String phone;
    public User (String lastName){
        this.lastName = lastName;
    }
    public User (String phone, String lastName) {
        this.phone = phone;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
