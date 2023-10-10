package oop;

public class IndividualCustomer extends Customer {//Bireysel müşteri bir müşteridir
    private String firtName;
    private String lastName;

    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
