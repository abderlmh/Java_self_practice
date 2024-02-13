package tasks13_oop_inheritance.student;

public class Student extends Students  {

    private String fieldOfStudy;
    private String studentId;
    private char grade;
    private String schoolName;

    public Student(String name, int age, String gender, String fieldOfStudy, String studentId, char grade, String schoolName) {
        super(name, age, gender);
        setFieldOfStudy(fieldOfStudy);
        setStudentId(studentId);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " " +schoolName);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' ;


    }
}
