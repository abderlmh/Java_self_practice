package tasks11_classa_and_object_part2;

import java.util.Arrays;

public class LocalRestaurent {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("han","152 benlin ave",5);

        Server server1 = new Server("adel",123,40,false);

        Chef chef1 = new Chef("col",145,40,true);

        Server[] servers = {server1};
        Chef[] chefs = {chef1};

        System.out.println(Arrays.toString(servers));
        System.out.println(Arrays.toString(chefs));

    }
}
