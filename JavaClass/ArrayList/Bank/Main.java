package JavaClass.ArrayList.Bank;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Estonia");

        bank.addBranch("Tallinn");

        bank.addCustomer("Tallinn", "Mart", 1113.33);
        bank.addCustomer("Tallinn", "Teet", 113.36);
        bank.addCustomer("Tallinn", "Tarmo", 313.33);

        bank.addBranch("Tartu");
        bank.addCustomer("Tartu", "Test4", 13.33);

        bank.addCustomerTransaction("Tallinn", "Mart", 23.33);
        bank.addCustomerTransaction("Tallinn", "Teet", 3.36);
        bank.addCustomerTransaction("Tallinn", "Tarmo", 13.33);

        bank.listCustomers("Tallinn", true);
    }
}
