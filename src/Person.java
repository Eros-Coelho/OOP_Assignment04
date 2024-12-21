/*
Name: Eros Lima Coelho
Student Number: 3151957
 */

import java.time.LocalDate;
import java.util.Objects;

public final class Person implements Comparable<Person> {
    private final String surname;
    private final String firstName;
    private final LocalDate dateOfBirth;

    public Person(String firstname, String surname, LocalDate dateOfBirth) {
        this.firstName = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return firstName + " " + surname + " " + dateOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, surname, dateOfBirth);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return firstName.equals(person.firstName) &&
                surname.equals(person.surname) &&
                dateOfBirth.equals(person.dateOfBirth);
    }

    @Override
    public int compareTo(Person person) {
        int firstNameComparison = this.firstName.compareTo(person.firstName);

        if (firstNameComparison == 0){
            return this.surname.compareTo(person.surname);
        }
        return firstNameComparison;
    }
}