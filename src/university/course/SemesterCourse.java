package university.course;

import university.Location;
import university.Student;

import java.time.LocalDate;
import java.util.List;

public class SemesterCourse {
    private Course SemesterCourse;
    private LocalDate lectureDate;
    private Location location;
    private int maxStudents;
    private int minStudents;
    private Semester courseSemester;
    private List<Student> enrolledStudents;


    public SemesterCourse(Course semesterCourse, LocalDate lectureDate, Location location, int maxStudents, int minStudents) {
        SemesterCourse = semesterCourse;
        this.lectureDate = lectureDate;
        this.location = location;
        this.maxStudents = maxStudents;
        this.minStudents = minStudents;
    }

    public Boolean enrollStudent(Student student){
        // Enroll one Student at a time
        return true; // after adding student to enrolledStudents
    }

    public Boolean enrollStudent(List<Student> student){
        // Enroll multiple Students at once. Should be @Transactional
        return true; // after adding student to enrolledStudents
    }
}
