package tasks13_oop_inheritance.student;

public class StudentClients {

    public static void main(String[] args) {

        Student student1 = new Student("Hazel",25,"M","IT","A01",'A',"Cydeo");
        System.out.println(student1);
        student1.study();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();

        GraduateStudent graduateStudent = new GraduateStudent("asil",14,"M","IT","A02",'A',"Cydeo");
        System.out.println(graduateStudent);
        graduateStudent.study();

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();

        CydeoStudent cydeoStudent = new CydeoStudent("said",14,"M","IT","A02",'A',"Cydeo",012,04,"java");
        cydeoStudent.study();
        System.out.println(cydeoStudent);

        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println();

        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Hanane",22,"F","IT","A03",'A',"Cydeo");
        undergraduateStudent.study();
        System.out.println(undergraduateStudent);

    }
}
