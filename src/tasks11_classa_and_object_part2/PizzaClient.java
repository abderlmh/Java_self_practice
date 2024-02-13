package tasks11_classa_and_object_part2;

public class PizzaClient {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza("Small",0,1);
        System.out.println("pizza 1 = " + pizza1);

        Pizza pizza2 = new Pizza("meduim",1,0);
        System.out.println("pizza 2 = " + pizza2);

        Pizza pizza3 = new Pizza("Large",0,2);
        System.out.println("pizza 3 = " + pizza3);
    }
}
