package tasks11_classa_and_object_part2;

public class Pizza {

    public String size ;
    public int numberOfCheeseTopping ;
    public int numberOfPepperoniTopping;


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost(){
        int startPrice = (size.equalsIgnoreCase("small")) ? 10
                   :(size.equalsIgnoreCase("medium")) ? 12 : 14;
        int totalCost = startPrice +(numberOfCheeseTopping*2)+(numberOfPepperoniTopping*2);
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total cost= "+calcCost()+
                '}';
    }
}
