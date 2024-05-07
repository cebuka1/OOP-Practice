package Demo_project;

import Demo_project.enums.CourseOffer;
import Demo_project.enums.Gender;
import Demo_project.model.*;
import Demo_project.service.PrincipalService;
import Demo_project.service.impl.ApplicantServiceImpl;
import Demo_project.service.impl.PrincipalServiceImpl;
import Demo_project.service.impl.StudentServiceImpl;
import Demo_project.service.impl.TeachableServiceImpl;

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher( "sunday ebuka", 23, Gender.MALE);
        Teacher teacher2 = new Teacher("kiki lola", 56, Gender.FEMALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.PYTHON);

        Principal principal = new Principal("John mary", 100, Gender.MALE);
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();

        Student student = new Student("chief love", 34, Gender.FEMALE);
        StudentServiceImpl expelStudent = new StudentServiceImpl();

        Applicants applicants1 = new Applicants("Harzard Chelsea", 32, Gender.TRANS_GENDER);
        Applicants applicants2 = new Applicants("monster thunder", 45, Gender.MALE);
        ApplicantServiceImpl applicants = new ApplicantServiceImpl();

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

        System.out.println("Principal data");
        principalService.display(principal);
        System.out.println("**************************************");

        System.out.println("Student Expelled Data");
        expelStudent.expelStudent(student, principal);
        System.out.println("***************************************");

        System.out.println("Applicant Data");
        applicants.display(applicants1);
        applicants.display(applicants2);



    }
}
