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

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public CourseParticipations getCourseParticipations() {
        return courseParticipations;
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

    public boolean graduate(){
        // TODO: implement logic to Check credits number of credits student has completed and graduate if its up to 90 ECTS
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
