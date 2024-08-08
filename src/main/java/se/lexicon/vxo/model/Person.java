package se.lexicon.vxo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Person implements Serializable {
    private int personId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;

    public Person(int personId, String firstName, String lastName, LocalDate dateOfBirth, Gender gender) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person(){}

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(dateOfBirth, person.dateOfBirth) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, firstName, lastName, dateOfBirth, gender);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("personId=").append(personId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
