/*
Name: Eros Lima Coelho
Student Number: 3151957
 */

import java.time.LocalDate;

public final class Person implements Comparable<Person> {
    private final String surname;
    private final String firstname;
    private final LocalDate dateOfBirth;

    public Person(String firstname, String surname, LocalDate dateOfBirth) {
        this.firstname = firstname;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return firstname + " " + surname + " " + dateOfBirth;
    }

    @Override
    public int compareTo(Person other) {
        return this.firstname.compareTo(other.firstname);
    }
}