package com.company;

public class PreSchool extends AbstractSchool{


    @Override
    public Double chargeFees(Student student) {

        double jk_fees = 100*1.1;
        double sk_fees = jk_fees +(jk_fees *25)/100;

        if(student.getGrade().equals(GradeType.JK_GRADE))
        {
            return jk_fees;
        }
        else{
            return sk_fees;
        }
    }
}
