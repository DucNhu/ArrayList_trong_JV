package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListCollectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(89);
        numbers.add(90);
        numbers.add(3);
        System.out.println("Before: " + numbers);
//        Sorting an ArryList using Collections.sort() method
        Collections.sort(numbers);
        System.out.println("After:" + numbers);
    }
}
