package JavaClass.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Places {
    public static void main(String[] args) {
        LinkedList<String> places = new LinkedList<String>();
        // places.add("Tallinn");
        // places.add("Tartu");
        // places.add("Pärnu");

        // printList(places);

        // places.add(0, "Narva");

        // printList(places);

        // places.remove(2);

        // printList(places);
        addInOrder(places, "Tallinn");
        addInOrder(places, "Tartu");
        addInOrder(places, "Pärnu");
        addInOrder(places, "Narva");

        printList(places);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparsion = stringListIterator.next().compareTo(newCity);
            if (comparsion == 0) {
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparsion > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparsion < 0) {

            }
        }

        stringListIterator.add(newCity);
        return true;
    }

}
