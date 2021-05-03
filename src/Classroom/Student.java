package Classroom;

public class Student {
    private String studentName;
    private String studentCountry;

    public Student(String studentName, String studentCountry) {
        this.studentName = studentName;
        this.studentCountry = studentCountry;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCountry() {
        return studentCountry;
    }

    public void setStudentCountry(String studentCountry) {
        this.studentCountry = studentCountry;
    }
}
