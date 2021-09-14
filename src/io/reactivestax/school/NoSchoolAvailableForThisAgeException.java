package io.reactivestax.school;

public class NoSchoolAvailableForThisAgeException extends Exception {
    public NoSchoolAvailableForThisAgeException(String s) {
        super(s);
    }
}
