package JavaClass.ArrayList.MobilePhone;

public class Main {
    public static void main(String[] args) {
        Contact contactTaavi = new Contact("Taavi", "123");
        Contact contactCristop = new Contact("Cristop", "456");
        Contact contactTruthy = new Contact("Truthy", "789");
        Contact contactPromet = new Contact("Promet", "346");

        MobilePhone mobilephone = new MobilePhone("1234");
        mobilephone.addNewContact(contactTaavi);
        mobilephone.addNewContact(contactCristop);
        mobilephone.addNewContact(contactPromet);
        mobilephone.printContacts();

        System.out.println();

        mobilephone.updateContact(contactTaavi, contactTruthy);
        mobilephone.printContacts();

        System.out.println();

        mobilephone.removeContact(contactCristop);
        mobilephone.printContacts();

        System.out.println();

        Contact query = mobilephone.queryContact("Truthy");
        System.out.println(query.getName());
    }
}