import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterAndSort {
    public static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    public static List<Person> filterAndSort(List<Person> listPersons) {
        return listPersons.stream()
                .filter(person -> person.age > 20)
                .sorted(Comparator.comparing(el -> el.name))
                .toList();
    }

    public static void main(String[] args) {
        System.out.println(filterAndSort(Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20),
                new Person("David", 25))));
    }
}