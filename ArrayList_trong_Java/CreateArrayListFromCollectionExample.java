package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(100);
        firstFivePrimeNumbers.add(11);
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println("nexTen 1: " + firstTenPrimeNumbers);
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(40);
        nextFivePrimeNumbers.add(12);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println("nexFive:" + firstTenPrimeNumbers);
    }
}
