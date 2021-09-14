package io.reactivestax.school;

public class HighSchool extends AbstractSchool {
    @Override
    public Double chargeFees(Student student) {

        double grade9Fees = 100 * 2.00;
        double grade10Fees = grade9Fees + (grade9Fees * 45) / 100;
        double grade11Fees = grade10Fees + (grade10Fees * 45) / 100;
        double grade12Fees = grade11Fees + (grade11Fees * 45) / 100;

        if (student.getGrade().equals(GradeType.GRADE_NINE)) {
            return grade9Fees;
        } else if (student.getGrade().equals(GradeType.GRADE_TEN)) {
            return grade10Fees;
        } else if (student.getGrade().equals(GradeType.GRADE_ELEVEN)) {
            return grade11Fees;
        } else {
            return grade12Fees;
        }
    }
}
