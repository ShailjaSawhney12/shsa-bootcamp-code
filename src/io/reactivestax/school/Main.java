package io.reactivestax.school;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        System.out.println("*********************************************************");

        System.out.println("Welcome to the School Admissions App!!!! Press X for exit");


        do {


            System.out.println("Enter the name of the student :");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            if (name.length() < 3 || name.length() > 50) {
                System.out.println("Name of the Student is either too short or too long. Please enter the name again");
                name = sc.nextLine();
            }

            System.out.println("Enter Date Of Birth of the student in mm/dd/yyyy format");
            String dob = sc.nextLine();
            String bday = LocalDate.parse(dob, DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.UK)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.UK));
            LocalDate today = LocalDate.now(); // This gives today,s date.
            LocalDate birthday = LocalDate.parse(bday);

            Period period = Period.between(birthday, today);

            int age = period.getYears();

            GradeType grade = null;
            try {
                grade = UtilityClass.determineGradeBasedOnAge(age);
            } catch (AgeNotCorrectException e) {
                System.out.println(e.toString());
                continue;
            }

            SchoolType schoolType = null;

            schoolType = UtilityClass.determineSchoolBasedOnGrade(grade);

            School school = UtilityClass.retrieveSchoolObjectBasedOnSchoolType(schoolType);

            Student student = new Student(name, age, grade);

            try {
                school.admitStudent(student);
                System.out.println(" at " + schoolType);
            } catch (ClassFullException e) {
                System.out.println(e);
            }

            System.out.println("Welcome to the School Admissions App!! Press X for exit");

            String exitKey = sc.nextLine();

            if (exitKey.equalsIgnoreCase("X")) {
                System.exit(0);
                break;
            }

        } while (true);
    }
}
