package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractSchool implements School {

    Map<GradeType, List<Student>> gradeToStudentsMap = new HashMap<>();

    @Override
    public Student admitStudent(Student student) throws ClassFullException {
        if (gradeToStudentsMap.get(student.getGrade()) == null) {
            List<Student> studentList = new ArrayList<>();
            studentList.add(student);
            gradeToStudentsMap.put(student.getGrade(), studentList);
        } else {
            List<Student> studentList = gradeToStudentsMap.get(student.getGrade());
            if (studentList.size() >= 3) {
                throw new ClassFullException(student.getGrade() + " is already full");
            }
            studentList.add(student);
            gradeToStudentsMap.put(student.getGrade(), studentList);
        }
        System.out.print("added student = " + student.getName() + " into grade " + student.getGrade());
        return student;
    }
}
