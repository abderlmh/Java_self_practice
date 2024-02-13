package tasks11_classa_and_object_part2;

public class CydeoStudent {

    public String name;
    public int age;
    public String id;

    public int batchNumber ;
    public int groupNumber ;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, String id, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class");
    }
    public void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public void setProgrammingLanguage(){
        System.out.println("programmingLanguage = " + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
