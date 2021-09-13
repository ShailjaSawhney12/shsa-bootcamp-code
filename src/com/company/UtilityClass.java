package com.company;

public class UtilityClass {
/*  Runtime Polymorphism - Instantiate sub-class objects into base class type object  */
    static School preSchool= new PreSchool();
    static School elementarySchool=new ElementarySchool();
    static School middleSchool=new MiddleSchool();
    static School highSchool=new HighSchool();

    public static GradeType determineGradeBasedOnAge(int age) throws AgeNotCorrectException {

        switch (age) {

            case 4:
                return GradeType.JK_GRADE;
            case 5:
                return GradeType.SK_GRADE;
            case 6:
                return GradeType.GRADE_ONE;
            case 7:
                return GradeType.GRADE_TWO;
            case 8:
                return GradeType.GRADE_THREE;
            case 9:
                return GradeType.GRADE_FOUR;
            case 10:
                return GradeType.GRADE_FIVE;
            case 11:
                return GradeType.GRADE_SIX;
            case 12:
                return GradeType.GRADE_SEVEN;
            case 13:
                return GradeType.GRADE_EIGHT;
            case 14:
                return GradeType.GRADE_NINE;
            case 15:
                return GradeType.GRADE_TEN;
            case 16:
                return GradeType.GRADE_ELEVEN;
            case 17:
                return GradeType.GRADE_TWELVE;

            default:
                //System.out.println("Age is invalid for admission");

                throw new AgeNotCorrectException("Age too low or too high");

        }
    }

    public static SchoolType determineSchoolBasedOnGrade(GradeType grade) {

        if (grade == GradeType.JK_GRADE || grade == GradeType.SK_GRADE) {
            return SchoolType.PRE_SCHOOL;
        } else if (grade == GradeType.GRADE_ONE || grade == GradeType.GRADE_TWO || grade == GradeType.GRADE_THREE || grade == GradeType.GRADE_FOUR
                || grade == GradeType.GRADE_FIVE) {
            return SchoolType.ELEMENTARY_SCHOOL;
        } else if (grade == GradeType.GRADE_SIX || grade == GradeType.GRADE_SEVEN || grade == GradeType.GRADE_EIGHT) {
            return SchoolType.MIDDLE_SCHOOL;
        } else {
            return SchoolType.HIGH_SCHOOL;
        }

    }

    public static School retrieveSchoolObjectBasedOnSchoolType(SchoolType school) {

        switch (school) {

            case PRE_SCHOOL:
                return preSchool;
            case ELEMENTARY_SCHOOL:
                return elementarySchool;
            case MIDDLE_SCHOOL:
                return middleSchool;
            case HIGH_SCHOOL:
                return highSchool;

            default:
                throw new IllegalArgumentException("Wrong School type");
                //System.out.println("Age is invalid for admission");

        }
    }

}
