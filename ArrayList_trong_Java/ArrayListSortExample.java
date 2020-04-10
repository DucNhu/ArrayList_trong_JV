package chuahieubai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennny");
        names.add("Mark");
        names.add("David");
        System.out.println("Name: " + names);
//        Sout an ArrayList using its sort() method. you must pass a comparator to the ArrayList.sort()
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name, String name2) {
                return name.compareTo(name2);
            }
        });
//        Following is an even more concise solution

        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names: " + names);
    }
}
