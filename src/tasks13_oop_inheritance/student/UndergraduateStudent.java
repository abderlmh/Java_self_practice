package tasks13_oop_inheritance.student;

public class UndergraduateStudent extends Student{
    public UndergraduateStudent(String name, int age, String gender, String fieldOfStudy, String studentId, char grade, String schoolName) {
        super(name, age, gender, fieldOfStudy, studentId, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }
}
