package Demo_project.service.impl;

import Demo_project.model.Course;
import Demo_project.model.Student;
import Demo_project.model.Teacher;
import Demo_project.service.CourseService;

public class TeachableServiceImpl implements CourseService {


    @Override
    public void teachCourse(Teacher teacher, Course course) {
        System.out.println("FullName : " + teacher.getName() + "\n" + "Gender : " + teacher.getName() + "\n" +
                "Age : " +  teacher.getAge() + "\n" + "Course taught : " + course.getCourseOffer());
    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("FullName : " + student.getName() + "\n"  + "Gender : " +student.getGender() + "\n"
         + "Age : " + student.getAge() + "\n" + "Course Taken : " + course.getCourseOffer());
    }
}