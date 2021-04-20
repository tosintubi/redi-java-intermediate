package university;

import university.course.CourseParticipations;

import java.time.LocalDate;

public class Student  extends Person{

    private String matriculationNumber;
    private CourseParticipations courseParticipations;
    private int creditPoints;


    public Student(String id, String firstName, String lastName, String email, LocalDate dateOfBirth) {
        super(id, firstName, lastName, email, dateOfBirth);
    }


    public int getCreditPoints(){
        // TODO: implement logic to calculate credit points student has completed
        return creditPoints;
    }

    public boolean enrolToCourse(){
        // TODO: implement logic to calculate credit points student has completed
        return false;
    }

    public boolean dropCourse(){
        // TODO: implement logic to drop a course already registered
        // Check if already registered.
        return false;
    }




    /*
CourseParticipations
        Immatrikulations#
        ----
        getCreditPoints()
        enrollTo(course)
        dropOutOf(course)?
        writeExam(course)
        graduate()
        getCourses()*/

}
