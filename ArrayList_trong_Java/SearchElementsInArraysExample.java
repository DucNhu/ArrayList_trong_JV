package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArraysExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nam");
        names.add("DUc");
        names.add("Khanh");
        names.add("Huyen");
        names.add("huy");
//        Check if an Arr contains a given element
        System.out.println();
        System.out.println("oes names array contain \"Huy\"?:" + names.contains("huy"));
//        Find the index of the forst occyrrence of an element in an Array
        System.out.println("Indexof \"Huyen\": "  + names.indexOf("Huyen"));
        System.out.println("Indexof \"Nam\": "  + names.indexOf("Nam"));
//        Find the inded of the last occurrence of a element in an ArrayList
        System.out.println("LastIndexOf\"Khanh\":" + names.lastIndexOf("Khanh"));
        System.out.println("LastIndexOf\"DUc\"" + names.lastIndexOf("DUc"));    }

}
