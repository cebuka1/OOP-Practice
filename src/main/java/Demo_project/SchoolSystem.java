package Demo_project;

import Demo_project.enums.CourseOffer;
import Demo_project.enums.Gender;
import Demo_project.model.Course;
import Demo_project.model.Teacher;
import Demo_project.service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher( "sunday ebuka", 23, Gender.MALE);
        Teacher teacher2 = new Teacher("kiki lola", 56, Gender.FEMALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.PYTHON);

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        System.out.println("Teacher Data");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("**********************************************");

        System.out.println("Teacher Data");
        teachableService2.teachCourse(teacher2, course2);
        System.out.println("**********************************************");
    }
}
