package io.reactivestax.school;

public class MiddleSchool extends AbstractSchool{


        @Override
        public Double chargeFees(Student student) {

            double grade6Fees = 100*1.75;
            double grade7Fees = grade6Fees +(grade6Fees *35)/100;
            double grade8Fees = grade7Fees +(grade7Fees *35)/100;

            if(student.getGrade().equals(GradeType.GRADE_SIX)  )
            {
                return grade6Fees;
            }
            else if(student.getGrade().equals(GradeType.GRADE_SEVEN)){

                return grade7Fees;
            }
            else{
                return grade8Fees;
            }
        }
}
