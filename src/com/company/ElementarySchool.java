package com.company;

public class ElementarySchool extends AbstractSchool {

    @Override
    public Double chargeFees(Student student) {

        double grade1Fees = 100 * 1.5;
        double grade2Fees = grade1Fees + (grade1Fees * 30) / 100;
        double grade3Fees = grade2Fees + (grade2Fees * 30) / 100;
        double grade4Fees = grade3Fees + (grade3Fees * 30) / 100;
        double grade5Fees = grade4Fees + (grade4Fees * 30) / 100;

        if (student.getGrade().equals(GradeType.GRADE_ONE)) {
            return grade1Fees;
        } else if (student.getGrade().equals(GradeType.GRADE_TWO)) {

            return grade2Fees;
        } else if (student.getGrade().equals(GradeType.GRADE_THREE)) {

            return grade3Fees;
        } else if (student.getGrade().equals(GradeType.GRADE_FOUR)) {

            return grade4Fees;
        } else {

            return grade5Fees;
        }
    }
}
