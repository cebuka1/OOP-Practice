package Demo_project.service.impl;

import Demo_project.model.Principal;
import Demo_project.model.Student;
import Demo_project.service.StudentService;

public class StudentServiceImpl implements StudentService {
    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student FullName : " + student.getName() + "\n" + "Expulsion Duration : " + "2 WEEKS"
        + "\n" + "Expelled By : " + "Principal " + principal.getName());
    }
}
