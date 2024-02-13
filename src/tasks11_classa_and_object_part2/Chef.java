package tasks11_classa_and_object_part2;

public class Chef {

    public  String name;
    public  int employeeID ;

    public double hourlyRate ;
    public boolean fullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder(){
        System.out.println("chef "+name+" is making an order");
    }
    public void washDishes(){
        System.out.println("Chef "+name+" is working the dishes");
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                '}';
    }
}
