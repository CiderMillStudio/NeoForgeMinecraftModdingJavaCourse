package net.wady;

// Person (which saves first, middle and last name, age and maybe a "social security number")

import java.util.ArrayList;
import java.util.List;

public class Person {

    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String dateOfBirth; // MM/DD/YYYY format
    private final String socialSecurityNum;


    public Person(String firstName, String middleName, String lastName, String dateOfBirth, String socialSecurityNum) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNum = socialSecurityNum;
    }

    public String getFullName(){
        String fullname = firstName + " " + middleName + " " + lastName;
        return fullname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }


}
