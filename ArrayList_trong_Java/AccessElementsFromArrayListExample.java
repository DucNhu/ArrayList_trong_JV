package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
//        Check if an Arr is empty
        System.out.println("In the topCompanies list empty?: " + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazom");
        topCompanies.add("FaceBook");
//        Find the size of an ARR
        System.out.println("Is the topCompanies list empty?: " + topCompanies.size() + "companies in the world");
        System.out.println(topCompanies);
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Scond Best company: " + secondBestCompany);
        System.out.println("Lest Company in the the list: " + lastCompany);
//        Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list:" + topCompanies);
    }
}
