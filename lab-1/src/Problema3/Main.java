package Problema3;

public class Main {
    public static void main(String[] args) {

        Adress address = new Adress("Arinului","Brasov", 2);
        PaymentMethod pm = new PaymentMethod("Cash");
        Customer customer1 = new Customer(address, pm);

        customer1.setFirstName("Laurentiu");
        customer1.setLastName("Tagarici");

        System.out.println(customer1.getCompleteName());
        System.out.println(customer1.getAdress());
        System.out.println(customer1.getPaymentMethod());
    }
}
