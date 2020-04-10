package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
//        Creating an ArrList of String
        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Bird");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);
        animals.add(2, "Elephant");
        System.out.println(animals);

    }
}
