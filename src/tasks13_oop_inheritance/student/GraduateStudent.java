package tasks13_oop_inheritance.student;

public class GraduateStudent extends Student{
    public GraduateStudent(String name, int age, String gender, String fieldOfStudy, String studentId, char grade, String schoolName) {
        super(name, age, gender, fieldOfStudy, studentId, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName() + " congratulations you Graduate");
    }
}
