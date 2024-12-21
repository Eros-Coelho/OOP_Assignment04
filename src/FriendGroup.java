/*
Name: Eros Lima Coelho
Student Number: 3151957
 */

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FriendGroup {

    private final Set<Person> friends;

//    initialising as an empty HashSet
    public FriendGroup(){
    this.friends = new HashSet<>();
    }

    public Set<Person> getFriends(){
        return friends;
    }

//    adds a person object to the set (which does not let repetition occur, therefore if the person already exists, it won't be added again
    public void add(Person person){
    if (person == null){
        throw new IllegalArgumentException("Person cannot be null");
        }
    friends.add(person);
    }

//    checks if a person exists in the friends set, return true if yes, no if otherwise
    public boolean search (Person person){
        if (person == null){
            throw new IllegalArgumentException("Person cannot be null");
        }
        return friends.contains(person);
    }

//    returns a copy of the friends set
    public Set<Person> getAll(){
    return new HashSet<>(friends);
    }

//    returns all person objects that match given surname into a new set
    public Set<Person> getAllBySurname(String surname){
    return friends.stream().filter(person -> person.getSurname().equalsIgnoreCase(surname)).collect(Collectors.toSet());
    }

//    same thing but with first name
    public Set<Person> getAllByFirstname(String firstname) {
        return friends.stream().filter(person -> person.getFirstname().equalsIgnoreCase(firstname)).collect(Collectors.toSet());
    }

//    now with date of birth
    public Set<Person> getAllByDateOfBirth(LocalDate date) {
        return friends.stream().filter(person -> person.getDateOfBirth().isEqual(date)).collect(Collectors.toSet());
    }

//    removes a person if it exists. return true if removed successfully, false if not
    public boolean remove(Person person){
        return friends.remove(person);
    }

//    returns friends sorted by their first names
    public List<Person> sort(){
        return friends.stream().sorted(Comparator.comparing(Person::getFirstname)).collect(Collectors.toList());
    }

//    now returns sorted by a parameter determined by the user
    public List<Person> sort(Comparator<Person> comparator){
        return friends.stream().sorted(comparator).collect(Collectors.toList());
    }

//    returns all person objects in the group as a single string, sorted by first name
    @Override
    public String toString() {
        return friends.stream().sorted(Comparator.comparing(Person::getFirstname)).map(Person::toString).collect(Collectors.joining("\n"));
    }
}