package chuahieubai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ArrayListUserDefinedObjectExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Rajeev", 25));
        users.add(new User("John", 24));
        users.add(new User("Steve", 23));
        users.forEach(us -> {
            System.out.println("name : " + us.getName() + "Age: " + us.getAge());
        });

    }
}
