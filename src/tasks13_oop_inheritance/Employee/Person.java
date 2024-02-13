package tasks13_oop_inheritance.Employee;

public class Person {

    private String name ;
    private int age;
    private char gender ;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name of the person can not be set to null");
            System.exit(1);
        }

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name of the person can not be set to empty  or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Age can not be set to negative or zero");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if( (""+gender).equalsIgnoreCase("f") || (""+gender).equalsIgnoreCase("m")  ) {
            this.gender = gender;
        }else{
            System.err.println("Gender can only be set to 'M' or 'F'");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
