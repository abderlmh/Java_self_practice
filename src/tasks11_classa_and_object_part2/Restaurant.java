package tasks11_classa_and_object_part2;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner;
    public String Location;

    public int numbersOfStars;

    ArrayList<String> Servers = new ArrayList<>();

    ArrayList<String> Chefs = new ArrayList<>();

    public Restaurant(String owner, String location, int numbersOfStars) {
        this.Owner = owner;
        this.Location = location;
        this.numbersOfStars = numbersOfStars;
    }

   /*public void hireServer (String server){
      Servers.add(server);
    }

    public void hireServer (String servers){
        Servers.addAll(Arrays.asList(servers));
    }
*/
    public void hireChef(String chef){
        Chefs.add(chef);
    }

    public void hireChef(String[] chef){
        Chefs.addAll(Arrays.asList(chef));
    }

    public void terminateChef (int employeeID){
        Chefs.remove(employeeID);
    }
    public void terminateServer(int employeeID){
        Servers.remove(employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numbersOfStars=" + numbersOfStars +
                ", Servers=" + Servers +
                ", Chefs=" + Chefs +
                '}';
    }
}
