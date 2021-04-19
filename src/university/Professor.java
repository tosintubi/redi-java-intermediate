package university;

import university.course.Course;

import java.time.LocalDate;
import java.util.List;

public class Professor extends Person{

    private List<Course> courses;
    private String room;
    private String employeeID;
    private List<Person> assistants;



    public Professor(String id, String firstName, String lastName, String email, LocalDate dateOfBirth) {
        super(id, firstName, lastName, email, dateOfBirth);
    }

    public void teachCourse(Course course){
        // TODO: Teach a course
    }

    public void gradeExam(Course course){
        // TODO: Teach a course
    }
}
