/*
Name: Eros Lima Coelho
Student Number: 3151957
 */

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        // creating 6 Person objects
        Person person1 = new Person("John", "Markson", LocalDate.of(1998, 2, 12));
        Person person2 = new Person("Mark", "Johnson", LocalDate.of(1996, 6, 21));
        Person person3 = new Person("Galadriel", "Finarfin", LocalDate.of(1954, 1, 1));
        Person person4 = new Person("Elrond", "Peredhil", LocalDate.of(1959, 2, 16));
        Person person5 = new Person("Elros", "Tar-Minyatur", LocalDate.of(1959, 2, 16));
        Person person6 = new Person("Samwise", "Gamgee", LocalDate.of(1987, 7, 14));

        // creating the 2 HashMaps
        Map<Person, Set<Person>> group1 = new HashMap<>();
        Map<Person, Set<Person>> group2 = new HashMap<>();

        // creating friendgroups for group1 and group2
        Set<Person> group1Friends = new HashSet<>();
        Set<Person> group2Friends = new HashSet<>();

        try {
//            adding friends to group1
            group1Friends.add(person2);
            group1Friends.add(person3);
//            map person1 to their friend group
            group1.put(person1, group1Friends);

//            adding friends to group2
            group2Friends.add(person4);
            group2Friends.add(person5);
//            map person2 to their friend group
            group2.put(person2, group2Friends);

//            iterating through group1 and printing the full name of each person along with their friends
            for (Map.Entry<Person, Set<Person>> entry : group1.entrySet()){
                Person key = entry.getKey();
                Set<Person> friends = entry.getValue();
                System.out.println(key.getFirstname() + " " + key.getSurname() + " is friends with ");

//                for each person going through the loop above, checks their friends and prints their name beside theirs
                for (Person friend : friends) {
                    System.out.println(" - " + friend.getFirstname() + " " + friend.getSurname());
                }
            }

//            same thing just for group2; iterating through people in group2, printing their names and that of their friends beside it
            for (Map.Entry<Person, Set<Person>> entry1 : group2.entrySet()) {
                Person key1 = entry1.getKey();
                Set<Person> friends1 = entry1.getValue();

            for (Map.Entry<Person, Set<Person>> entry2 : group2.entrySet()) {
                Person key2 = entry2.getKey();
                Set<Person> friends2 = entry2.getValue();

//                checks if one person is in both friend groups at the same time, and if so, prints their name with the message below
                if (friends1.contains(key2) && friends2.contains(key1)){
                    System.out.println(key1.getFirstname() + " " + key1.getSurname() + " is in both friend groups");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
//            shows error message in case needed
        }
    }
}
