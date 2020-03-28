package Problema3;

public class Customer {
    private String lastName;
    private String firstName;
    private int age;

    private Adress adress;
    private PaymentMethod pm;

    public Customer(Adress adress, PaymentMethod pm) {
        this.adress = adress;
        this.pm = pm;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getCompleteName() {
        return this.firstName + ", " + this.lastName;
    }

    public String getAdress() {
        return this.adress.getFullAdress();
    }

    public String getPaymentMethod() {
        return this.pm.getType();
    }
}