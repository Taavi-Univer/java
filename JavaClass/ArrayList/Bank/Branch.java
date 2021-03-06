package JavaClass.ArrayList.Bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();

    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initial) {
        if (findCustomer(name) == null) {
            this.customers.add(new Customer(name, initial));
            return true;
        }

        return false;
    }

    public boolean addCustomerTransaction(String name, double initial) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(initial);
            return true;
        }

        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
