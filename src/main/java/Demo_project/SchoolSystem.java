package Demo_project;

import Demo_project.enums.CourseOffer;
import Demo_project.enums.Gender;
import Demo_project.model.Course;
import Demo_project.model.Student;
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



        Student student1 = new Student( "Mike ebuka", 23, Gender.MALE);
        Student student2 = new Student("Agborom lola", 36, Gender.FEMALE);

        TeachableServiceImpl takeCourse1 = new TeachableServiceImpl();
        TeachableServiceImpl takeCourse2 = new TeachableServiceImpl();

        Course course3 = new Course(CourseOffer.JAVA);
        Course course4 = new Course(CourseOffer.PYTHON);

        System.out.println("Student Data");
        takeCourse1.takeCourse(student1, course3);
        System.out.println("*************************************");

        System.out.println("Student data");
        takeCourse2.takeCourse(student2, course4);
        System.out.println("**************************************");

    }
}
