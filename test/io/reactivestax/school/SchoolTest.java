package io.reactivestax.school;

import org.junit.Assert;
import org.junit.Test;

public class SchoolTest {

    @Test
    public void testGradeForAge(){

        GradeType grade = null;
        try {
            grade = UtilityClass.determineGradeBasedOnAge(8);
        } catch (AgeNotCorrectException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(grade == GradeType.GRADE_THREE);
    }

    @Test
    public void testSchoolForGrade(){

        SchoolType school = null;
        school = UtilityClass.determineSchoolBasedOnGrade(GradeType.GRADE_SEVEN);

        Assert.assertTrue(school == SchoolType.MIDDLE_SCHOOL);
    }

    @Test
    public void testFeeForElementaryGrade2(){

        ElementarySchool elementarySchool = new ElementarySchool();
        double fee = elementarySchool.chargeFees(new Student("sha", 7, GradeType.GRADE_TWO));

        Assert.assertTrue(fee == 195);
    }

}
