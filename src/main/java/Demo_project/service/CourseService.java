package Demo_project.service;

import Demo_project.model.Course;
import Demo_project.model.Student;
import Demo_project.model.Teacher;

public interface CourseService {
    void teachCourse(Teacher teacher, Course course);
    void takeCourse (Student student, Course course);
}
