package ArrayList_trong_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ArrayListObjSortExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("CHris", 7));
        people.add(new Person("shin", 17));
        people.add(new Person("chin", 27));

        System.out.println("Person list: " + people);
//        Sort people by their age
        people.sort((person, person2) -> {
            return person.getAge() - person2.getAge();
        });
        //        A more concise way of writing the above sorting func:
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sourted Person List by Age: " + people);
//        U can also sort using Collections.sort() method by passing the custom Comparator
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name: " + people);
    }
}
