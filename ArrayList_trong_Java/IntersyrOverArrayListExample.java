package chuahieubai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class IntersyrOverArrayListExample {
    public static void main(String[] args) {
        List<String> tvSHows = new ArrayList<>();
        tvSHows.add("Breaking bad");
        tvSHows.add("Game of thrones");
        tvSHows.add("friends");
        tvSHows.add("Prison break");
        System.out.println("=== Interte using JV 8 foreach and lambda===");
        for (String tvSHow :tvSHows
             ) {System.out.println(tvSHows);

        };
        System.out.println("\n === Interate using an interator() ===");
        Iterator<String> tvShowIterator = tvSHows.iterator();
       while (tvShowIterator.hasNext()) {
           String tvShow = tvShowIterator.next();
           System.out.println(tvShow);
       }
        System.out.println("\n ====== Iterate using an iterator() and JV 8 forEachRemainting(0 method ====");
       tvShowIterator = tvSHows.iterator();
       tvShowIterator.forEachRemaining(tvSHow -> {
           System.out.println(tvSHow);
       });
        System.out.println("\n Iterate using an list(terator() to traverse in both direvtion ===");
//        hera, we start from the end of the list and traerse backwards
//        ListIterator<String> tvShowListIterator = tvSHows.listIterator(tvSHows.size());
//        while (tvShowListIterator.hasPrevious()) {
//            String tvShow = tvShowListIterator.previous();
//            System.out.println(tvShow);
//        }
//        System.out.println("\n === Iterae using simple for-each loop===");
//        for(String tvShow: tvSHows) {
//            System.out.println(tvShow);
//        }
//        System.out.println("\n === Iterate using for loop with index===");
//        for(int i = 0; i < tvSHows.size(); i++) {
//            System.out.println(tvSHows.get(i));
//        }

    }
}
